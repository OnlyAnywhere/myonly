package IO;

import org.junit.Test;

import java.io.*;

/**
 * Created by chenjunjun on 16/1/14 14:01
 */
public class Test2 {


    //创建文件
    @Test
    public void createFile(){
        File f=new File("/Users/OnlyAnywhere/TEST/filetest/haha.txt");
        try{
            f.createNewFile();
        }catch (Exception e) {
            e.printStackTrace();
        }
    }

    //创建文件夹
    @Test
    public void createDir(){
        File f = new File("/Users/OnlyAnywhere/TEST/filetest/lolo");
        try{
            if(f.exists()){
                f.delete();
            }
            f.mkdir();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    //列出制定目录的全部文件
    @Test
    public void viewList(){
        File f = new File("/Users/OnlyAnywhere/TEST/filetest");
        try{
            String[] str=f.list();
            for (int i = 0; i < str.length; i++) {
                System.out.println(str[i]);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    //列出制定目录的全部文件1
    @Test
    public void viewList1(){
        File f = new File("/Users/OnlyAnywhere/TEST/filetest");
        try{
            File[] str=f.listFiles();
            for (int i = 0; i < str.length; i++) {
                if(str[i].isDirectory()){
                    System.out.println("d:"+str[i]);
                }else{
                    System.out.println("f:"+str[i]);
                }

            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    //递归列出制定目录的全部文件1，包括子目录
    @Test
    public void viewAllList(){
        File f = new File("/Users/OnlyAnywhere/TEST/loss");

        print(f,0);
    }

    public static void print(File file,Integer flag){

        if(file!=null){
            if(file.isDirectory()){
                flag+=1;
                File[] files = file.listFiles();
                if(files!=null){
                    for(File ff:files){
                        print(ff,flag);
                    }
                }

            }else{
                System.out.println("第"+flag+"级目录："+file.getAbsolutePath());
            }
        }
    }


    //向文件中写字符串  按照字符写入
    @Test
    public void writeCharToFile() throws Exception{
        File f = new File("/Users/OnlyAnywhere/TEST/filetest/haha.txt");
        OutputStream outputStream = null;
        try{
            outputStream = new FileOutputStream(f);//加上第二个 参数为true，就是追加内容
            String str = "你";
            System.out.println(str.getBytes().length);
            //outputStream.write(str.getBytes());

            byte[] b=str.getBytes();
            for (int i = 0; i < b.length; i++) {
                System.out.println(i);
                outputStream.write(b[i]);
            }

            outputStream.flush();
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            if(outputStream!=null){
                outputStream.close();
            }
        }
    }

    //向文件中写字符串  按照字节写入
    @Test
    public void writeCharToFileByByte() throws Exception{
        File f = new File("/Users/OnlyAnywhere/TEST/filetest/haha.txt");
        OutputStream outputStream = null;
        try{
            outputStream = new FileOutputStream(f,true);//加上第二个 参数为true，就是追加内容
            String str = "Chenjunjun";
            byte[] b=str.getBytes();
            for (int i = 0; i < b.length; i++) {
                System.out.println(i);
                outputStream.write(b[i]);
            }
            outputStream.flush();
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            if(outputStream!=null){
                outputStream.close();
            }
        }
    }

    //文件中读取内容    字节流
    @Test
    public void readFileContent() throws Exception{
        File f = new File("/Users/OnlyAnywhere/TEST/filetest/haha.txt");
        InputStream inputStream = new FileInputStream(f);
        byte[] b = new byte[1024];
        int len = inputStream.read(b);//read 函数的返回值是读入的字节数
        inputStream.close();
        System.out.println(new String(b,0,len));
    }

    //动态定义byte长度
    @Test
    public void readFileDynamicByte() throws Exception {
        File f = new File("/Users/OnlyAnywhere/TEST/filetest/haha.txt");
        InputStream inputStream = new FileInputStream(f);
        byte[] b=new byte[(int)f.length()];
        inputStream.read(b);
        System.out.println("文件长度为："+f.length());
        inputStream.close();
        System.out.println(new String(b));
    }

    //一个一个字节读取
    @Test
    public void readFileContentByBytes() throws Exception{
        File f = new File("/Users/OnlyAnywhere/TEST/filetest/haha.txt");
        InputStream inputStream = new FileInputStream(f);
        byte[] b=new byte[(int)f.length()];
        for (int i = 0; i < b.length; i++) {

            b[i]=(byte)inputStream.read();
            System.out.println(i+"-"+b[i]);
        }
        inputStream.close();
        System.out.println(new String(b));
    }

    //一个一个读取字节然后通过结束标志来标识
    @Test
    public void readFileContentByBytesWithEndFlag() throws Exception{
        File f = new File("/Users/OnlyAnywhere/TEST/filetest/haha.txt");
        InputStream inputStream = new FileInputStream(f);
        byte[] b=new byte[1024];
        int count =0;
        int temp=0;
        while((temp=inputStream.read())!=(-1)){
            b[count++]=(byte)temp;
        }
        inputStream.close();
        System.out.println(new String(b));
        System.out.println(new String(b,0,count));
    }

    //字符流写入数据
    @Test
    public void writeToFileByChar() throws Exception{
        File f = new File("/Users/OnlyAnywhere/TEST/filetest/haha.txt");
        Writer writer = new FileWriter(f);
        writer.write("Hello");
        writer.write("\r\nHello");
        writer.close();
    }

    //字符流读取数据
    @Test
    public void readFileByChar() throws Exception{
        File f = new File("/Users/OnlyAnywhere/TEST/filetest/haha.txt");
        Reader reader = new FileReader(f);
        char[] chars = new char[100];
        int count = reader.read(chars);
        reader.close();
        System.out.println("读入的长度为："+count);
        System.out.println("内容为:\n"+new String(chars,0,count));
    }

    //字符流读取数据  循环检测结尾标识
    @Test
    public void readFileByCharWithEndFlag() throws Exception{
        File f = new File("/Users/OnlyAnywhere/TEST/filetest/haha.txt");
        Reader reader = new FileReader(f);
        char[] ch=new char[100];
        int temp=0;
        int count=0;
        while((temp=reader.read())!=(-1)){
            ch[count++]=(char)temp;
        }
        reader.close();
        System.out.println("内容为"+new String(ch,0,count));

    }

    /**
     * 关于字节流和字符流的区别

     实际上字节流在操作的时候本身是不会用到缓冲区的，是文件本身的直接操作的，但是字符流在操作的 时候下后是会用到缓冲区的，是通过缓冲区来操作文件的。

     读者可以试着将上面的字节流和字符流的程序的最后一行关闭文件的代码注释掉，然后运行程序看看。你就会发现使用字节流的话，文件中已经存在内容，
     但是使用字符流的时候，文件中还是没有内容的，这个时候就要刷新缓冲区。
     */



}
