findUserByName
===
*根据Id查询User
 select * from t_user where 1=1
 @if(!isEmpty(name)){
 and name = #name#
 @}