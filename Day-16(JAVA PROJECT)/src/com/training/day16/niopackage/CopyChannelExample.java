package com.training.day16.niopackage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.ReadableByteChannel;
import java.nio.channels.WritableByteChannel;
import java.nio.file.Files;

public class CopyChannelExample {
	public static void main(String[] args) throws IOException {
		FileInputStream input = new FileInputStream("/home/administrator/Desktop/JavaProgram/Hello/data1.txt");
		ReadableByteChannel source = input.getChannel();
		
		FileOutputStream output = new FileOutputStream("/home/administrator/Desktop/JavaProgram/Hello/data2.txt");
		WritableByteChannel dest= output.getChannel();
		copyData(source,dest);
		source.close();
		dest.close();
	}
	public static void copyData(ReadableByteChannel src ,WritableByteChannel dest) throws IOException {
		ByteBuffer buffer = ByteBuffer.allocateDirect(16*1024);
		while(src.read(buffer)!=-1) {
			buffer.flip();//prepare the buffer to be drained
			while(buffer.hasRemaining()) {
				dest.write(buffer);//make sure that the buffer was fully drained
			}
			buffer.clear();//make the buffer empty,ready for filling
		}
	}
}
