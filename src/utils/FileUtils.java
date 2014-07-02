package utils;

import java.io.File;
import java.io.FileFilter;

/**
 * Created by zhangyb on 14-6-30.
 */
public class FileUtils {
    /**
	 * 返回目录下的所有文件(不包括文件夹)
	 * @param dir
	 * @return
	 */
	private static File[] dirList(String dir) {
		File path = new File(dir);
		File[] files = path.listFiles(new FileFilter() {
			@Override
			public boolean accept(File pathname) {
				return pathname.isFile();
			}
		});
		return files;
	}
    
}
