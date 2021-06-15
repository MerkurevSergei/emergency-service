## Сервис “Управление аварийным транспортом”
___
Структура БД:  
vehicle (id, type_id, model_id, number, capacity)  
type (id, name)  
model (id, name)

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
