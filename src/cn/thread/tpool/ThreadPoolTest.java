package cn.thread.tpool;

import java.io.File;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ThreadPoolTest {
	
	
	public static void main(String[] args) {
		ThreadPoolExecutor executor = 
				new ThreadPoolExecutor(5, 10, 200, TimeUnit.MILLISECONDS, new ArrayBlockingQueue<Runnable>(5));
	
	String fileurl = "C:\\Users\\liuhuan\\Desktop\\pooltest\\";
	
		for(int i=0;i<2;i++){
            MyTask myTask = new MyTask(fileurl+i);
            executor.execute(myTask);
            System.out.println("线程池中线程数目："+executor.getPoolSize()+"，队列中等待执行的任务数目："+
            executor.getQueue().size()+"，已执行玩别的任务数目："+executor.getCompletedTaskCount());
        }
        executor.shutdown();
	
	}
	
	
	
}



class MyTask implements Runnable{
	
	private String fileUrl;
	public MyTask(String fileUrl){
		this.fileUrl = fileUrl;
	}
	
	@Override
	public void run() {
			
			try {
//				Thread.currentThread().sleep(3000);
				File[] fileList = getFileList(fileUrl);
				if(fileList != null){
					for (int i = 0; i < fileList.length; i++) {
						String fileUrl = fileList[i].toString();
						System.out.println("fileUrl===" + fileUrl);
						
						
						
						
					}
				}
				
			} catch (Exception e) {
				e.printStackTrace();
			}
		
		
	}
	
	
	private static File[] getFileList(String filesUrl) {
		File file = new File(filesUrl);
		if(file.exists() && file.isDirectory()){
			return file.listFiles();
		}
		return null;
	}
	
	
}


