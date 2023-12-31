### Задание:

Ниже список тестовых сценариев. Ваша задача - определить тип каждого теста (юнит-тест, интеграционный тест, сквозной тест) и объяснить, почему вы так решили.

"Проверка того, что функция addContact корректно добавляет новый контакт в список контактов".

"Проверка того, что при добавлении контакта через пользовательский интерфейс, контакт корректно отображается в списке контактов".

"Проверка полного цикла работы с контактом: создание контакта, его редактирование и последующее удаление".

### Решение:


1. Проверка того, что функция addContact корректно добавляет новый контакт в список контактов - это юнит-тест. 
Он проверяет конкретную функциональность - добавление контакта - и включает в себя все необходимые проверки, 
чтобы убедиться, что функция работает правильно.


2. Проверка того, что при добавлении контакта через пользовательский интерфейс, 
контакт корректно отображается в списке контактов - это интеграционный тест. 
Этот тест проверяет, как различные части системы взаимодействуют друг с другом, в данном случае, 
между пользовательским интерфейсом и внутренним функционалом приложения.


3. Проверка полного цикла работы с контактом: создание контакта, его редактирование и последующее удаление - это сквозной тест. 
Он охватывает все этапы работы с контактом и проверяет, что каждый из них выполняется корректно.