package user;

public class Session {
	private static Session session;

	public Session getSession() {
		return session;
	}

	public static  Session setSession(Session sess) {
		session = sess;
		return session;
	}

}
