/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fasade;
import java.io.IOException;

/**
 *
 * @author pupys
 */
public class PatternFasadStandardizationPSI {

    /**
     * Фасад (Facade) представляет шаблон проектирования, который позволяет скрыть сложность системы с помощью предоставления упрощенного интерфейса для взаимодействия с ней.
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        FasadFileOperations fOp = new FasadFileOperations();
        String resultRead = fOp.readFile("resurces\\forTests\\readMe.txt");
        System.out.println(resultRead);
        fOp.writeFile("resurces\\forTests\\writeToMe.txt", resultRead, false);
    }
    
}
