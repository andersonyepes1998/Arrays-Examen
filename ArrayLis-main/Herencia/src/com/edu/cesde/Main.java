package com.edu.cesde;

import javax.naming.Name;
import javax.swing.*;
import java.awt.geom.QuadCurve2D;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner inputData = new Scanner(System.in);

        //esta es la base de datos

        List<Monitor> monitores = new ArrayList();
        List<Cpu> Cpus = new ArrayList();
        List<Televisor> televisores = new ArrayList();

        String i = "Si";
        while (i.equals("Si") || i.equals("si") || i.equals("SI")) {

            System.out.println("Ingrese cual producto desea comprar, teniendo en cuenta que 1 es para monitores y 2 para Cpu: ");
            int tipo = (Integer.parseInt(inputData.nextLine()));

            if (tipo == 1) {


                //Se crea el objeto
                Monitor monitor = new Monitor();
                //Se capturan los valores para los campos:
                System.out.println("Ingrese marca: ");
                monitor.setBrand(inputData.nextLine());
                System.out.println("Ingrese nombre: ");
                monitor.setName(inputData.nextLine());
                System.out.println("Ingrese referencia: ");
                monitor.setReference(Integer.parseInt(inputData.nextLine()));
                System.out.println("Ingrese tamaño pantalla: ");
                monitor.setScreenSize(Integer.parseInt(inputData.nextLine()));
                System.out.println("Ingrese resolución: ");
                monitor.setResolution(Double.parseDouble(inputData.nextLine()));
                monitores.add(monitor);
            } else if (tipo == 2) {

                Cpu cpu = new Cpu();
                System.out.println("Ingrese la marca cpu: ");
                cpu.setBrand(inputData.nextLine());
                System.out.println("Ingrese el nombre de la cpu: ");
                cpu.setName(inputData.nextLine());
                System.out.println("Ingrese la referencia de la cpu: ");
                cpu.setReference(Integer.parseInt(inputData.nextLine()));
                System.out.println("Ingrese tamaño de la ram: ");
                cpu.setRam(inputData.nextLine());
                System.out.println("Ingrese el tamaño del disco: ");
                cpu.setHardDisk(inputData.nextLine());
                Cpus.add(cpu);
            }else if (tipo == 3){
                Televisor televisor = new Televisor();
                System.out.println("Ingrese la marca del televisor: ");
                televisor.setBrand(inputData.nextLine());
                System.out.println("Ingrese el nombre del televisor: ");
                televisor.setName(inputData.nextLine());
                System.out.println("Ingrese la referencia del televisor: ");
                televisor.setReference(Integer.parseInt(inputData.nextLine()));
                System.out.println("Ingrese la resolucion del televisor: ");
                televisor.setResolution(Double.parseDouble(inputData.nextLine()));
                System.out.println("Ingrese el tamaño del televisor: ");
                televisor.setSize(Double.parseDouble(inputData.nextLine()));
            }
            else{
                break;
            }

            System.out.println("DESEA CONTINUAR SI O NO");
            String car = inputData.nextLine();
            if (car.equals("NO")){
                break;
            }
        }


        System.out.println("mostrar monitor(1) o cpu(2)");
        int type2 = (Integer.parseInt(inputData.nextLine()));

        switch (type2){
            case 1:
                for (int b = 0; b<monitores.size(); b++){
                    System.out.println("el nombre seria: "+monitores.get(b).getName());
                }
                break;

            case 2:
                for (int c = 0; c<Cpus.size(); c++)
                    System.out.println("la marca seria: "+Cpus.get(c).getBrand());
                }


            System.out.println("Deseas buscar algun producto monitor(1) o cpu(2)");
            int type3 = (Integer.parseInt(inputData.nextLine()));

            switch (type3){
                case 1:
                    int refenceTosearch = Integer.parseInt(inputData.nextLine());

                    for (int d=0; d<monitores.size(); d++){
                        if (monitores.get(d).getReference() == refenceTosearch){
                            System.out.println(monitores.get(d).getName());
                            break;
                        }
                    }
                case 2:
                     String Disk = inputData.nextLine();

                     for (int e=0; e<Cpus.size(); e++){
                         if (Cpus.get(e).getHardDisk().equals(Disk)){
                             System.out.println(Cpus.get(e).getName());
                         }
                     }
            }
        }
    }
