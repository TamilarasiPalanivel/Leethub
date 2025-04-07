select t1.customer_id,count(*) as count_no_trans
From Visits as t1
LEFT JOIN Transactions as t2
ON t1.visit_id=t2.visit_id
where t2.transaction_id is null
group by t1.customer_id;
