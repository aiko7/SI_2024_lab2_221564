# SI_2024_lab2_221564
1. Константин Јовановски 221564

2.
![image](https://github.com/aiko7/SI_2024_lab2_221564/assets/115356535/929de866-611d-467a-b117-ca5fd2ec27e7)

3. Цикломатската комплексност = E(рабови) - V(темиња) + 2P(региони), Според формулата се добива дека цикломаската комплексност = 6, т.е постојат 6 линеарно независни патишта.

4.

    1.Празна allItems листа:
    output: RuntimeException ("allItems list can't be null!")

    2.Продукт без име:
    input: allItems = {("", "111", 111), (null, "111", 111)}, payment = 111
    output: name is set to unknown

    3.Продукт без баркод
    input: allItems = {("bookInRussian", null, 111), ("wow", "", 111)}, payment = 111
    output: RuntimeException("No barcode!")

    4.Баркод со невалиден карактер
    input: allItems = {("halb", "dont_like_barcodes", 100)}, payment = 100
    output: RuntimeException("Invalid character in item barcode!")

    5.Продукт со попуст
    input: allItems = {("thing", "111", 100, 0.1)} , payment = 300
    output: sum = 10

    6.Продукт без попуст
    input: allItems = {("thingy", "222", 100, 0)} , payment = 200 
    output: 100
  
    7.Продукт со попуст, цена поголема од 300 и баркод кој почнува на 0:
    input: allItems = {("hehe", "0001", 500, 0.5)}, payment = 300
    output: sum = 220; 250 - 30

    8.Сумата на сите продукти е помала или еднаква од уплатата
    input: allItems = {("eheh", "0001", 500, 0.5)}, payment = 300
    output: sum = 220, payment = 300; return true

    9.Сумата на продуктите е поголема од уплатата
    input: allItems = {("mmmm", "0001", 500, 0.5)}, payment = 200
    output: sum = 220; payment = 200; return false

