package pl.ja.security;

import java.util.Collection;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Component;

@Component
public class AuthenticationComponent {
	Authentication auth = SecurityContextHolder.getContext().getAuthentication();
	
	public boolean isAnonymous() {
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();

		return (auth!=null && auth.isAuthenticated() && "anonymousUser".equals(auth.getName()));	
	}
	
	public String loginUser() {
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		return auth.getName();
	}
	
	public boolean isAdmin() {
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		Collection<? extends GrantedAuthority> authorities = auth.getAuthorities();
		for(GrantedAuthority grantedAuthority: authorities) {
			System.out.println("Authority value: " + grantedAuthority.getAuthority());
			return "admin".equalsIgnoreCase(grantedAuthority.getAuthority());
		}
		return false;
	}
	
}
