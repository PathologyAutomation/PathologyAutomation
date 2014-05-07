package factories;

import entities.LoginRegisterEntity;

public class LoginFactory 
{
	public LoginRegisterEntity getAdminLogin()
	{
        
		LoginRegisterEntity LoginRegisterEntity=new LoginRegisterEntity();
		
		LoginRegisterEntity.Username="admin";
		LoginRegisterEntity.Password="admin";
		
		return LoginRegisterEntity;
		
	}
	
	public LoginRegisterEntity getTechnicianLogin()
	{
        
		LoginRegisterEntity LoginRegisterEntity=new LoginRegisterEntity();
		
		LoginRegisterEntity.Username="jchamplin";
		LoginRegisterEntity.Password="1234";
		
		return LoginRegisterEntity;
		
	}
}
