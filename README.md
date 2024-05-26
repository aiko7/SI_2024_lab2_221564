# SI_2024_lab2_221564
1. Константин Јовановски 221564

2.
![image](https://github.com/aiko7/SI_2024_lab2_221564/assets/115356535/929de866-611d-467a-b117-ca5fd2ec27e7)

3. Цикломатската комплексност = E(рабови) - V(темиња) + 2P(региони), Според формулата се добива дека цикломаската комплексност = 6, т.е постојат 6 линеарно независни патишта.

4.

    1. Празна allItems листа:
    Output: RuntimeException ("allItems list can't be null!")

    2. Продукт без име:
    Input: allItems = {("", "111", 111), (null, "111", 111)}, payment = 111
    Output: name is set to unknown

    3. Продукт без баркод
    Input: allItems = {("bookInRussian", null, 111), ("wow", "", 111)}, payment = 111
    Output: RuntimeException("No barcode!")

    4. Баркод со невалиден карактер
    Input: allItems = {("halb", "dont_like_barcodes", 100)}, payment = 100
    Output: RuntimeException("Invalid character in item barcode!")

    5. Продукт со попуст
    Input: allItems = {("thing", "111", 100, 0.1)} , payment = 300
    Output: sum = 10

    6. Продукт без попуст
    Input: allItems = {("thingy", "222", 100, 0)} , payment = 200 
    Output: 100
  
    7. Продукт со попуст, цена поголема од 300 и баркод кој почнува на 0:
    Input: allItems = {("hehe", "0001", 500, 0.5)}, payment = 300
    Output: sum = 220; 250 - 30

    8. Сумата на сите продукти е помала или еднаква од уплатата
    Input: allItems = {("eheh", "0001", 500, 0.5)}, payment = 300
    Output: sum = 220, payment = 300; return true

    9. Сумата на продуктите е поголема од уплатата
    Input: allItems = {("mmmm", "0001", 500, 0.5)}, payment = 200
    Output: sum = 220; payment = 200; return false

5.

    1. Сите услови се точни
    Input: item = new Item("hehehehe", "0001", 400, 0.1)
    Output: sum е намалена за 30

    2. price > 300 е неточно, discount > 0 е точно, barcode starts with '0' е точно
    Input: item = new Item("mrrrp", "0001", 299, 0.1)
    Output: sum не е намалена

    3. price > 300 е точно, discount > 0 е неточно, barcode starts with '0' е точно
    Input: item = new Item("meow", "0001", 500, 0)
    Output: sum не е намалена

    4. price > 300 е точно, discount > 0 е точно, barcode starts with '0' е неточно
    Input: item = new Item("hihi", "1111", 500, 0.1)
    Output: sum не е намалена

    5. price > 300 е неточно, discount > 0 е неточно, barcode starts with '0' е точно
    Input: item = new Item("Hi", "0001", 500, 0)
    Output: sum не е намалена

    6. price > 300 е точно, discount > 0 е неточно, barcode starts with '0' е неточно
    Input: item = new Item("mlem", "1111", 500, 0)
    Output: sum is not reduced

    7. price > 300 е неточно, discount > 0 е точно, barcode starts with '0' е неточно
    Input: item = new Item("yuh", "1111", 200, 0.1)
    Output: sum не е намалена

    8. Сите услови се неточни
    Input: item = new Item("item1", "1123", 200, 0)
    Output: sum не е намалена
