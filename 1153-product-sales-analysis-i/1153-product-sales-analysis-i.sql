select Product.product_name,Sales.year,Sales.price
From Product
Right join Sales
ON Product.product_id=Sales.product_id