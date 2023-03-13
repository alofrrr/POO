package lojaInformatica;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Main {

    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        // Criação de Clientes
        Cliente client1 = new Cliente("João", "joao@mail.com", "Rua A, 123", new ArrayList<String>(), sdf.parse("01/01/2000"), "123.456.789-00");
        Cliente client2 = new Cliente("Maria", "maria@mail.com", "Rua B, 456", new ArrayList<String>(), sdf.parse("01/01/1990"), "987.654.321-00");
        ArrayList<Cliente> customers = new ArrayList<Cliente>();
        customers.add(client1);
        customers.add(client2);

        Funcionario employee1 = new Funcionario("Lucas", "lucas@mail.com", "Rua C, 789", new ArrayList<String>(), sdf.parse("01/01/2020"), "Vendedor", sdf.parse("01/01/1995"), "111.222.333-44");
        ArrayList<Funcionario> employees = new ArrayList<Funcionario>();
        employees.add(employee1);

        Fornecedor supplier1 = new Fornecedor("Fornecedor A", "fornecedora@mail.com", "Rua D, 123", new ArrayList<String>(), null, "111.222.333/0001-11");
        ArrayList<Fornecedor> suppliers = new ArrayList<Fornecedor>();
        suppliers.add(supplier1);

        Produto product1 = new Produto(1, "Mouse", 20.0, supplier1);
        Produto product2 = new Produto(2, "Teclado", 30.0, supplier1);
        ArrayList<Produto> products = new ArrayList<Produto>();
        products.add(product1);
        products.add(product2);

        Venda sale = new Venda(customers, products, employees, 50.0, 0.0);

        // Calcula o valor final da venda com desconto para um cliente
        String customerCPF = "987.654.321-00";
        sale.getFinalValueWithDiscount(customerCPF);

        // Calcula o valor final da venda com desconto para um funcionário
        String employeeCPF = "111.222.333-44";
        sale.getFinalValueWithDiscount(employeeCPF);

        // Calcula o valor final da venda com desconto para um novo cliente
        String newCustomerCPF = "000.111.222-33";
        sale.getFinalValueWithDiscount(newCustomerCPF);
    }
}
