
        public class Main {
            private static final  Employee[] EMPLOYEES = new Employee[10];

            public static void main(String[] args) {
                EMPLOYEES[0] = new Employee("Павлов Андрей Игоревич", 1, 41000);
                EMPLOYEES[1] = new Employee("Крылов Павел Андреевич", 2, 44000);
                EMPLOYEES[2] = new Employee("Дроздов Сергей Анатольевич", 2, 48000);
                EMPLOYEES[3] = new Employee("Королев Андрей Игоревич", 3, 50000);
                EMPLOYEES[4] = new Employee("Михайлов Дмитрий Петрович", 1, 52000);
                EMPLOYEES[5] = new Employee("Андреев Дмитрий Сергеевич", 3, 55000);
                EMPLOYEES[6] = new Employee("Обухов Аркадий Петрович ", 4, 55000);
                EMPLOYEES[7] = new Employee("Николаев Игорь Иванович", 4, 60000);
                EMPLOYEES[8] = new Employee("Лукоянов Алексей Дмитриевич", 5, 58000);
                EMPLOYEES[9] = new Employee("Шустов Андрей Николаевич", 5, 65000);
                for (int i = 0; i < EMPLOYEES.length; i++) {
                    System.out.println(EMPLOYEES[i]);
                }
                System.out.println("Сумма  ЗП сотрудников -" + calculateSumOfSalary(EMPLOYEES));
                System.out.println("Сотрудник с минимальной ЗП-" + findEmployeeWithMinSalary(EMPLOYEES));
                System.out.println("Сотрудник с максимально ЗП-" + findEmployeeWithMaxSalary(EMPLOYEES));
                System.out.println("Средняя ЗП-" + calculateAverageOfSalaries(EMPLOYEES));
                printFullNames(EMPLOYEES);
            }

            private static void print(Employee[] employees) {
                for (Employee employee : EMPLOYEES) {
                    System.out.println(employee);
                }
            }

            private static int calculateSumOfSalary(Employee[] employees) {
                int sum = 0;
                for (Employee employee : EMPLOYEES) {
                    sum += employee.getSalary();
                }
                return sum;
            }

            private static Employee findEmployeeWithMinSalary(Employee[] EMPLOYEES) {
                Employee employeeWithMinSalary = null;
                for (Employee employee : EMPLOYEES) {
                    if (employeeWithMinSalary == null || employee.getSalary() < employeeWithMinSalary.getSalary()) {
                        employeeWithMinSalary = employee;
                    }

                }
                return employeeWithMinSalary;
            }

            private static Employee findEmployeeWithMaxSalary(Employee[] EMPLOYEES) {
                Employee employeeWithMaxSalary = null;
                for (Employee employee : EMPLOYEES) {
                    if (employeeWithMaxSalary == null || employee.getSalary() > employeeWithMaxSalary.getSalary()) {
                        employeeWithMaxSalary = employee;
                    }
                }
                return employeeWithMaxSalary;
            }

            private static double calculateAverageOfSalaries(Employee[] EMPLOYEES) {
                return ( double ) calculateSumOfSalary(EMPLOYEES) / EMPLOYEES.length;

            }

            private static void printFullNames(Employee[] EMPLOYEES) {
                for (Employee employee : EMPLOYEES) {
                    System.out.println(employee.getFullName());


                }
            }
        }
