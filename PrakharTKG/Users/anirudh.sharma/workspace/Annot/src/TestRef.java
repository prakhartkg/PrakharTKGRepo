import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.Method;

class TestRef {
	
		public static void main(String[] args) throws IOException {
	Class obj = TestAnnotation.class;
	
	try {
		Method method=obj.getDeclaredMethod("print");
		CustomAnnotation ca=method.getAnnotation(CustomAnnotation.class);
		String message=ca.message();
		String path=ca.path();
		FileOutputStream out = new FileOutputStream(path);
		 byte b[]=message.getBytes();//converting string into byte array  
	     out.write(b);  
	     out.close();  
	     
	} catch (NoSuchMethodException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (SecurityException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	

}
}