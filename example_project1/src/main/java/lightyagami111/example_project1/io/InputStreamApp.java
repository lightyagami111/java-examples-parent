/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lightyagami111.example_project1.io;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PushbackInputStream;

/**
 *
 * @author ivaylo
 */
public class InputStreamApp {

    public static void main(String[] args) throws IOException {
        byte[] bytes = new byte[]{1, 2, 3, 4, 5, 6, 7, 8, 9};

        InputStream originalStream = new ByteArrayInputStream(bytes);

        byte[] readBytes = getBytes(originalStream, 3);
        printBytes(readBytes); // prints: 1 2 3

        readBytes = getBytes(originalStream, 3);
        printBytes(readBytes); // prints: 4 5 6

    // now let's wrap it with PushBackInputStream
        originalStream = new ByteArrayInputStream(bytes);

        InputStream wrappedStream = new PushbackInputStream(originalStream, 10); // 10 means that maximnum 10 characters can be "written back" to the stream

        readBytes = getBytes(wrappedStream, 3);
        printBytes(readBytes); // prints 1 2 3

        ((PushbackInputStream) wrappedStream).unread(readBytes, 0, readBytes.length);

        readBytes = getBytes(wrappedStream, 3);
        printBytes(readBytes); // prints 1 2 3

    }

    private static byte[] getBytes(InputStream is, int howManyBytes) throws IOException {
        System.out.print("Reading stream: ");

        byte[] buf = new byte[howManyBytes];

        int next = 0;
        for (int i = 0; i < howManyBytes; i++) {
            next = is.read();
            if (next > 0) {
                buf[i] = (byte) next;
            }
        }
        return buf;
    }

    private static void printBytes(byte[] buffer) throws IOException {
        System.out.print("Reading stream: ");

        for (int i = 0; i < buffer.length; i++) {
            System.out.print(buffer[i] + " ");
        }
        System.out.println();
    }

}
