package Exercise2;
//Задача №2
// 1. Создать класс Financial record, с двумя атрибутами: incomes, outcomes (доходы, расходы)
// 2. Создать в этом классе геттеры, сеттеры и конструктор на все атрибуты
// 3. Создать 10 отчетов, с разными доходами и расходами (Смотри класс new Random(1).nextInt() )
// 4. Записать в файл "report.txt" все данные из отчетов.
// 5. Прочитать файл report.txt, просуммировать все доходы и вывести на экран, тоже самое с расходами
// Ожидаемый результат: общие доходы - (какое то число), общие расходы - (какое то число)

import java.io.*;
import java.util.ArrayList;
import java.util.List;



public class Exercise2 {
    static String output;
    public static void main(String[] args) throws IOException {
        FileInput();
        FileOutput();
        TotalIncomes();
        TotalOutput();




    }

    public static void FileInput() throws IOException {
        List<FinancialRecord> report=new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            report.add(new FinancialRecord(((int) (Math.random() * 10000)),((int) (Math.random() * 10000))));
        }
        FileWriter writer= new FileWriter("D:\\Projekt JAVA\\HomeWork4\\src\\report.txt");
        for (int i = 0; i < report.size(); i++) {
            writer.write(report.get(i).getIncomes()+" ");

        }
        for (int i = 0; i < report.size(); i++) {
            writer.write( report.get(i).getOutcomes()+" ");
        }
        writer.close();
    }

    public static void FileOutput() throws IOException {
        FileReader fileReader=new FileReader("D:\\Projekt JAVA\\HomeWork4\\src\\report.txt");
        BufferedReader bufferedReader=new BufferedReader(fileReader);
        while (bufferedReader.ready()){
            output=bufferedReader.readLine();
        }
        fileReader.close();

    }
    public static void TotalIncomes(){
        String[] incomes =output.split(" ");
        int result=0;
        for (int i = 0; i < 9; i++) {
            result+=Integer.parseInt(incomes[i]);
        }
        System.out.println("Общий доход составил: "+result);
    }

    public static void TotalOutput(){
        String [] outcomes=output.split(" ");
        int result=0;
        for (int i = 10; i <outcomes.length ; i++) {
            result+=Integer.parseInt(outcomes[i]);
        }
        System.out.println("Общий расход составил: "+result);
    }


}
