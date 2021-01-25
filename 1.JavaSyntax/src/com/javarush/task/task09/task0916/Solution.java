package com.javarush.task.task09.task0916;

import java.io.IOException;
import java.rmi.RemoteException;

/* 
Перехват checked-исключений
*/

public class Solution {
    public static void main(String[] args) {
        handleExceptions(new Solution());

    }

    public static void handleExceptions(Solution obj) {
        try {
        obj.method1();
        obj.method2();
        obj.method3();
        }
        catch (RemoteException re){
            System.out.println("RemoteException has been caught");
        }
        catch (IOException ioe){
            System.out.println("IOException has been caught");
        }
        catch (NoSuchFieldException nsfe){
            System.out.println("NoSuchFieldException has been caught");
        }

    }

    public void method1() throws IOException {
        throw new IOException();
    }

    public void method2() throws NoSuchFieldException {
        throw new NoSuchFieldException();
    }

    public void method3() throws RemoteException {
        throw new RemoteException();
    }
}
