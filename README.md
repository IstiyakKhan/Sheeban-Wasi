# Sheeban-Wasi

Download : https://www.kaggle.com/datasets/fedesoriano/california-housing-prices-data-extra-features?resource=download

Requirements : Set-Up DB

Need to set-up DB
1) Download and install postgresql from your browser
2) During the setup process set password as 'root' and leave port number to default
3) After installation search and open 'PGAdmin 4' then on the left side select the server 'postgres' enter the password
4) Then navigate to postgres -> Schemas -> Tables -> Right Click on tables -> Create
5) Then Create a table with the name 'houses' and in column enter all the columns available in the csv file with datatype as varying character and also add a column as 'id' with datatype of bigserial
6) After the table is created then right click on the table -> Import/Export then import the data using the csv file.
