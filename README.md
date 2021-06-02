# emergency-service
Emergency Call Handling service

Сервис Producer отправляет в очередь следующие команды:
Управления машиной службы
Вид вызова (скорая, полиция, пожар)
Вид поездки (На вызов, на тех. обслуживание, в гараж)
Адрес
Управление вызовами
Идентификатор
Адрес
Приоритет (1 - максимальный, 5 - минимальный)
Тип (добавить, отменить...)
Дополнительная информация
Управление ресурсами
Тип операции (приход, расход)
ID объекта
ID ресурса (медикаменты, другие ресурсы)

Легенда: Центр управления с таблом на котором отображаются машины аварийных служб, вызовы машины и наличие в машинах ресурсов. Из центра управления отдаются команды, также команды о расходе медикаментов могут отдаваться непосредственно из машин (в сервис Producer). Каждый сервис Consumer выполняет команду, записывая новое состояние объекта в БД


Шаг 1. Подготовить docker-compose.yml с PostgresSql и RabbitMQ
Материалы по Docker and Docker-compose:
Плейлист по docker: (4) Docker основные команды. Поиск и скачивание образов, запуск, остановка, удаление. - YouTube
Docker и Docker Compose - Деплой проекта с нуля | Udemy
Содержание – Docker для начинающих – Stepik
Мои выдержки
https://www.notion.so/Docker-and-Compose-98b73167f28c4622a82606cf506eaa75

Шаг 2. Разработать сервис “Управление аварийным транспортом”
Структура БД:
vehicle
id
type_id
model_id
number
capacity
type
id
name
model
id
name

GET /emergency/vehicles - список ТС
GET /emergency/vehicles/{id} - информация о ТС по id
POST /emergency/vehicles - добавить ТС
PUT /emergency/vehicles/{id} - редактировать ТС
DELETE  /emergency/vehicles/{id} - удалить ТС

GET /emergency/vehicles/types - список типов ТС
GET /emergency/vehicles/types/{id} - информация о типе ТС
POST /emergency/vehicles/types - добавить тип ТС
PUT /emergency/vehicles/types/{id} - редактировать тип ТС
DELETE  /emergency/vehicles/types/{id} - удалить тип ТС

Шаг 3. Подготовить каркас сервиса “Управление поездками аварийного транспорта”
GET /emergency/rides
GET /emergency/rides/{id}
POST /emergency/rides
PUT /emergency/rides/{id}
DELETE  /emergency/rides/{id}
