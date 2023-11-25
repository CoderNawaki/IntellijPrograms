
@Configuration
@EnableWebSecurity
public  class SecurityConfig extends WebSecurityConfigurerAdapter{


    @Autowired
    private DataSource dataSource;

    @Override
    private void configure(HttpSecurity http) throws Exception{

            http
            .authorizeRequests()
                .antMatchers("/", "/home","/users/current","/users/current/accounts").authenticated()
                .antMatchers("/accounts","/accounts/**").hasAnyRole("USER","ADMIN")
                .antMatchers("/users","/users/**").hasRole("ADMIN")
                .and()
            .formLogin()
                .loginPage("/login")
                .permitAll()
                .and()
            .logout()
                .permitAll();
    }


    }
        @Autowired
    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
        auth
            .jdbcAuthentication()
                .dataSource(dataSource)
                .usersByUsernameQuery("select username, password, enabled from users where username=?")
                .authoritiesByUsernameQuery("select username, role from user_roles where username=?");
    }


}