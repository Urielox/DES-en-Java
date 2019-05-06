public class DatoDes {
    public void datoDes(String clave,String dato){
        String [] C= new String [17];
        String [] D= new String [17]; 
        String [] K=new String [17];
        String [] L= new String [17];
	String [] R= new String [17];
        
        String datos="";
        String valor="";
        int caja=0;
        int m=0;
        int n=0;
        int [] boxes=new int [9];
          
        int [] permutacion1={57,49,41,33,25,17,9,1,58,50,42,34,26,18,10,2,59,51,43,35,27,19,11,3,60,52,44,36,63,55,47,39,31,23,15,7,62,54,46,38,30,22,14,6,61,53,45,37,29,21,13,5,28,20,12,4};
        int [] permutacion2={14,17,11,24,1,5,3,28,15,6,21,10,23,19,12,4,26,8,16,7,27,20,13,2,41,52,31,37,47,55,30,40,51,45,33,48,44,49,39,56,34,53,46,42,50,36,29,32};
        int [] permuinicial={58,50,42,34,26,18,10,2,60,52,44,36,28,20,12,4,62,54,46,38,30,22,14,6,64,56,48,40,32,24,16,8,57,49,41,33,25,17,9,1,59,51,43,35,27,19,11,3,61,53,45,37,29,21,13,5,63,55,47,39,31,23,15,7};
        int [] ER={32,1,2,3,4,5,4,5,6,7,8,9,8,9,10,11,12,13,12,13,14,15,16,17,16,17,18,19,20,21,20,21,22,23,24,25,24,25,26,27,28,29,28,29,30,31,32,1};
        int [][] s1={{14,4,13,1,2,15,11,8,3,10,6,12,5,9,0,7},{0,15,7,4,14,2,13,1,10,6,12,11,9,5,3,8},{4,1,14,8,13,6,2,11,15,12,9,7,3,10,5,0},{15,12,8,2,4,9,1,7,5,11,3,14,10,0,6,13}};
        int [][] s2={{15,1,8,14,6,11,3,4,9,7,2,13,12,0,5,10},{3,13,4,7,15,2,8,14,12,0,1,10,6,9,11,5},{0,14,7,11,10,4,13,1,5,8,12,6,9,3,2,15},{13,8,10,1,3,15,4,2,11,6,7,12,0,5,14,9}};
        int [][] s3={{10,0,9,14,6,3,15,5,1,13,12,7,11,4,2,8},{13,7,0,9,3,4,6,10,2,8,5,14,12,11,15,1},{13,6,4,9,8,15,3,0,11,1,2,12,5,10,14,7},{1,10,13,0,6,9,8,7,4,15,14,3,11,5,2,12}};
        int [][] s4={{7,13,14,3,0,6,9,10,1,2,8,5,11,12,4,15},{13,8,11,5,6,15,0,3,4,7,2,12,1,10,14,9},{10,6,9,0,12,11,7,13,15,1,3,14,5,2,8,4},{3,15,0,6,10,1,13,8,9,4,5,11,12,7,2,14}};
        int [][] s5={{2,12,4,1,7,10,11,6,8,5,3,15,13,0,14,9},{14,11,2,12,4,7,13,1,5,0,15,10,3,9,8,6},{4,2,1,11,10,13,7,8,15,9,12,5,6,3,0,14},{11,8,12,7,1,14,2,13,6,15,0,9,10,4,5,3}};
        int [][] s6={{12,1,10,15,9,2,6,8,0,13,3,4,14,7,5,11},{10,15,4,2,7,12,9,5,6,1,13,14,0,11,3,8},{9,14,15,5,2,8,12,3,7,0,4,10,1,13,11,6},{4,3,2,12,9,5,15,10,11,14,1,7,6,0,8,13}};
        int [][] s7={{4,11,2,14,15,0,8,13,3,12,9,7,5,10,6,1},{13,0,11,7,4,9,1,10,14,3,5,12,2,15,8,6},{1,4,11,13,12,3,7,14,10,15,6,8,0,5,9,2},{6,11,13,8,1,4,10,7,9,5,0,15,14,2,3,12}};
        int [][] s8={{13,2,8,4,6,15,11,1,10,9,3,14,5,0,12,7},{1,15,13,8,10,3,7,4,12,5,6,11,0,14,9,2},{7,11,4,1,9,12,14,2,0,6,10,13,15,3,5,8},{2,1,14,7,4,10,8,13,15,12,9,0,3,5,6,11}};
        int [] PermutacionP={16,7,20,21,29,12,28,17,1,15,23,26,5,18,31,10,2,8,24,14,32,27,3,9,19,13,30,6,22,11,4,25};
        int [] Permufinal={40,8,48,16,56,24,64,32,39,7,47,15,55,23,63,31,38,6,46,14,54,22,62,30,37,5,45,13,53,21,61,29,36,4,44,12,52,20,60,28,35,3,43,11,51,19,59,27,34,2,42,10,50,18,58,26,33,1,41,9,49,17,57,25};

                for (int k = 0; k < permutacion1.length; ++k) {
                    valor += clave.charAt(permutacion1[k] - 1);
                }

                for (int i = 0; i < (valor.length() / 2); ++i) {
                    datos += valor.charAt(i);
                }
        
    C[0] = datos;
    datos = "";

                for (int i = (valor.length() / 2); i < valor.length(); ++i) {
                    datos += valor.charAt(i);
                }
    D[0] = datos;
    datos = "";
    valor = "";

                for (int i = 0; i < 16; ++i) {
                    if (i < 2 || i == 8 || i == 15) {
                            C[i + 1] = C[i].substring(1, 28) + C[i].substring(0, 1);
                    } else {
                            C[i + 1] = C[i].substring(2, 28) + C[i].substring(0, 2);
                    }

                    if (i < 2 || i == 8 || i == 15) {
                            D[i + 1] = D[i].substring(1, 28) + D[i].substring(0, 1);
                        } else {
                    D[i + 1] = D[i].substring(2, 28) + D[i].substring(0, 2);
                    }
                }

                for (int i = 1; i < 17; ++i) {
                    for (int k = 0; k < permutacion2.length; ++k) {
                            valor += (C[i] + D[i]).charAt(permutacion2[k] - 1);
                    }
                        K[i] = valor;
                        valor = "";
                }

                for (int k = 0; k < permuinicial.length; ++k) {
                    valor += dato.charAt(permuinicial[k] - 1);
                }

                for (int i = 0; i < (valor.length() / 2); ++i) {
                        datos += valor.charAt(i);
                }
        
        
    L[0] = datos;
    datos = "";

                for (int i = (valor.length() / 2); i < valor.length(); ++i) {
                    datos += valor.charAt(i);
                }

    R[0] = datos;
        
                for(int z=0;z<16;++z){
                        datos = "";
                        valor = "";

                for (int k = 0; k < ER.length; ++k) {
                    valor += R[z].charAt(ER[k] - 1);
                }

                for (int i = 1; i <= K[z+1].length(); ++i) { 
                    if (valor.charAt(i - 1) == K[z+1].charAt(i - 1)) {
                          datos += 0;
                    } else {
                        datos += 1;
                    }
                }

    valor = "";
    int num = 1;
                for (int a = 0; a <= 47; a = a + 6) {
                    caja = num;
                    if (datos.charAt(a) == '0' && datos.charAt(a + 5) == '0') {
                            m = 0;
                    }
                    if (datos.charAt(a) == '0' && datos.charAt(a + 5) == '1') {
                            m = 1;
                    }
                    if (datos.charAt(a) == '1' && datos.charAt(a + 5) == '0') {
                            m = 2;
                    }
                    if (datos.charAt(a) == '1' && datos.charAt(a + 5) == '1') {
                            m = 3;
                    }
                    if ("0000".equals(datos.substring(a + 1, a + 5))) {
                            n = 0;
                    }
                    if ("0001".equals(datos.substring(a + 1, a + 5))) {
                            n = 1;
                    }
                    if ("0010".equals(datos.substring(a + 1, a + 5))) {
                            n = 2;
                    }
                    if ("0011".equals(datos.substring(a + 1, a + 5))) {
                            n = 3;
                     }
                    if ("0100".equals(datos.substring(a + 1, a + 5))) {
                            n = 4;
                    }
                    if ("0101".equals(datos.substring(a + 1, a + 5))) {
                            n = 5;
                    }
                    if ("0110".equals(datos.substring(a + 1, a + 5))) {
                            n = 6;
                     }
                    if ("0111".equals(datos.substring(a + 1, a + 5))) {
                            n = 7;
                    }
                    if ("1000".equals(datos.substring(a + 1, a + 5))) {
                             n = 8;
                    }
                    if ("1001".equals(datos.substring(a + 1, a + 5))) {
                             n = 9;
                    }
                    if ("1010".equals(datos.substring(a + 1, a + 5))) {
                            n = 10;
                    }
                    if ("1011".equals(datos.substring(a + 1, a + 5))) {
                            n = 11;
                    }
                    if ("1100".equals(datos.substring(a + 1, a + 5))) {
                            n = 12;
                    }
                    if ("1101".equals(datos.substring(a + 1, a + 5))) {
                            n = 13;
                    }
                     if ("1110".equals(datos.substring(a + 1, a + 5))) {
                            n = 14;
                    }
                    if ("1111".equals(datos.substring(a + 1, a + 5))) {
                            n = 15;
                    }

            if (caja == 1) {
                boxes[num] = s1[m][n];
            }
            if (caja == 2) {
                boxes[num] = s2[m][n];
            }
            if (caja == 3) {
                boxes[num] = s3[m][n];
            }
            if (caja == 4) {
                boxes[num] = s4[m][n];
            }
            if (caja == 5) {
                boxes[num] = s5[m][n];
            }
            if (caja == 6) {
                boxes[num] = s6[m][n];
            }
            if (caja == 7) {
                boxes[num] = s7[m][n];
            }
            if (caja == 8) {
                boxes[num] = s8[m][n];
            }
            num = num + 1;
        }

        for (int j = 1; j < boxes.length; ++j) {
            
            int numero = boxes[j];
             if (numero == 0) {
                valor += "0000";
            }
            if (numero == 1) {
                valor += "0001";
            }
            if (numero == 2) {
                valor += "0010";
            }
            if (numero == 3) {
                valor += "0011";
            }
            if (numero == 4) {
                valor += "0100";
            }
            if (numero == 5) {
                valor += "0101";
            }
            if (numero == 6) {
                valor += "0110";
            }
            if (numero == 7) {
                valor += "0111";
            }
            if (numero == 8) {
                valor += "1000";
            }
            if (numero == 9) {
                valor += "1001";
            }
            if (numero == 10) {
                valor += "1010";
            }
            if (numero == 11) {
                valor += "1011";
            }
            if (numero == 12) {
                valor += "1100";
            }
            if (numero == 13) {
                valor += "1101";
            }
            if (numero == 14) {
                valor += "1110";
            }
            if (numero == 15) {
                valor += "1111";
            }
        }
    datos = "";
        for (int k = 0; k < PermutacionP.length; ++k) {
            datos += valor.charAt(PermutacionP[k] - 1);
        }
         valor = "";

        for (int b = 1; b <= datos.length(); ++b) { //Xor
            if (L[z].charAt(b - 1) == datos.charAt(b - 1)) {
                valor += 0;
            } else {
                valor += 1;
            }
        }   
    R[z+1] = valor;
    L[z+1] = R[z];
    }
 
    datos="";
    valor="";
    valor=R[16]+L[16];
         
          for (int k = 0; k < Permufinal.length; ++k) {
            datos += valor.charAt(Permufinal[k] - 1);
        }
          valor="";
        
        
        System.out.println("El cifrado es de : "+datos);
      
       }         
}
