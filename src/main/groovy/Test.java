// Copyright (c) 2016 ${ORGANIZATION_NAME}. All rights reserved.


import java.io.File;
import java.util.regex.Pattern;

/**
 * Created by 钟光燕 on 2016/11/29.
 * e-mail guangyanzhong@163.com
 */

public class Test {

    public static void main(String[] args) {
        System.out.println("Hello World!   "+ Pattern.quote(File.pathSeparator));
        for (int i = 0; i < args.length; i++) {
            System.out.println(args);
        }
    }
}