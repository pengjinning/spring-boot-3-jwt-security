/*
 * @Author: jack ning github@bytedesk.com
 * @Date: 2024-01-16 21:02:34
 * @LastEditors: jack ning github@bytedesk.com
 * @LastEditTime: 2024-01-26 17:42:11
 * @FilePath: /spring-boot-3-jwt-security/src/main/java/com/alibou/security/SecurityApplication.java
 * @Description: 这是默认设置,请设置`customMade`, 打开koroFileHeader查看配置 进行设置: https://github.com/OBKoro1/koro1FileHeader/wiki/%E9%85%8D%E7%BD%AE
 */
package com.alibou.security;

import com.alibou.security.auth.AuthenticationService;
// import com.alibou.security.auth.RegisterRequest;
// import com.alibou.security.user.Role;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

import static com.alibou.security.user.Role.ADMIN;
import static com.alibou.security.user.Role.MANAGER;

@SpringBootApplication
@EnableJpaAuditing(auditorAwareRef = "auditorAware")
public class SecurityApplication {

	public static void main(String[] args) {
		SpringApplication.run(SecurityApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(
			AuthenticationService service) {
		return args -> {
			// var admin = RegisterRequest.builder()
			// .firstname("Admin")
			// .lastname("Admin")
			// .email("admin@mail.com")
			// .password("password")
			// .role(ADMIN)
			// .build();
			// System.out.println("Admin token: " +
			// service.register(admin).getAccessToken());

			// var manager = RegisterRequest.builder()
			// .firstname("Admin")
			// .lastname("Admin")
			// .email("manager@mail.com")
			// .password("password")
			// .role(MANAGER)
			// .build();
			// System.out.println("Manager token: " +
			// service.register(manager).getAccessToken());
		};
	}
}
