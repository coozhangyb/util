package test;

import utils.FileUtils;

import java.io.File;

/**
 * Created by zhangyb on 14-7-2.
 */
public class TestFile {
    public static void main(String[] args){
        File[] files = FileUtils.dirList("/home/zhangyb");
        for (int i = 0; i < files.length; i++) {
            System.out.println(files[i].getName());
        }
    }
}
