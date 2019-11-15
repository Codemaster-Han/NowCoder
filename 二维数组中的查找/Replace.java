/**
实现一个函数，将一个字符串中的每个空格替换成“%20”。
例如，当字符串为We Are Happy.则经过替换之后的字符串为We%20Are%20Happy。
*/
import java.util.Arrays;
public class Replace{
	public static void main(String[] args){
		StringBuffer str=new StringBuffer ("we are famely");
		System.out.println(replaceSpace(str));
	}
	
	
    public static String replaceSpace(StringBuffer str) {
     if(str==null)
     {
        return null;
     }
     for(int i=0;i<str.length();i++)
     {
         char c = str.charAt(i);
         if(c==' ')
         {
            str.replace(i,i+1,"%20");
         }
     }
	 String a=str.toString();//将StringBuffer 转换成 String
	 return a;
	}
	
}