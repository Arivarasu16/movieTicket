package models;

public class SignupModel {
		private String name;
		private String pass;
		private String email;
		private String phoneno;
		public String getName() {
			return name;
		}
		public String getPass() {
			return pass;
		}
	    public String getEmail() {
	    	return email;
	    }
	    public String getPhone() {
	    	return phoneno;
	    }
	    public void setName(String n) {
			name=n;
		}
		public void setPass(String p) {
			pass =p ;
		}
	    public void setEmail(String e) {
	    	email=e;
	    }
	    public void setPhone(String p) {
	    	phoneno=p;
	    }
	}
