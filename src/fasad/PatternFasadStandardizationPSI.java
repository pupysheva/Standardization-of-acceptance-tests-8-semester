/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fasad;
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
        String resultRead = fOp.readFile("forTests\\readMe.txt");
        System.out.println(resultRead);
        fOp.writeFile("forTests\\writeToMe.txt", resultRead, false);
    }
    
}
