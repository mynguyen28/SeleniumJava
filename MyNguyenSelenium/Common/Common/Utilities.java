package Common;

public class Utilities {

	public static String replaceString(String str, String[] rpl)
	{
		for (int i = 0; i < rpl.length; i++) {
			
			str = str.replace("$$", rpl[i]);
		}
		return str;
	}

	public static String getProjectPath()
	{
		return System.getProperty("user.dir");
	}
}
