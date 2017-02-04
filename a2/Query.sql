-- table Sailors
select * from Sailors;

-- table Boats
select * from Boats;

--table Reserves
select * from Reserves;



-- Q1
select S.name, S.age, S.rating*2 
from Sailors S
where S.name like 'A%' OR S.name like '_ust%';

-- Q2
select name, sid 
from   Sailors
where  rating * 5 < age;

-- Q3
select name, sid 
from   Sailors
where  name like '%u%';

--  Q4
select * 
from Sailors
where rating is not null;

-- Q5
select * 
from Sailors
where rating is null;

-- Q6
select sid, rating * 0 
from   Sailors;

-- Q7
select sid as sailor_id, rating / 10 as normalized_rating
from   Sailors;

-- Q8
select S.sid, S.rating / 10 as normalized_rating
from   Sailors S;

-- Q9
select * 
from Reserves
order by sid, bid;

-- Q10
select * 
from Reserves
order by sid desc, bid;

-- Q11
select S.name
from   Sailors S, Reserves R
where  S.sid = R.sid
and    R.bid = 101;

-- Q12
select S.age 
from   Sailors S, Reserves R, Boats B
where  S.sid = R.sid
and    R.bid = B.bid
and    B.color = 'red';

-- Q13
select distinct S.age 
from   Sailors S, Reserves R, Boats B
where  S.sid = R.sid
and    R.bid = B.bid
and    B.color = 'red';

-- Q14*
select   distinct S.name, S.rating
from     Sailors S, Reserves R, Boats B
where    S.sid = R.sid
and      R.bid = B.bid
and      B.name = 'Interlake'
and      S.name like '%u%';

-- Q15*
select   R.day
from     Sailors S, Reserves R, Boats B
where    S.sid = R.sid
and      R.bid = B.bid
and      B.color = 'red'
and      S.age < 40;

-- Q16
select DISTINCT S.sid
from   Sailors S, Boats B, Reserves R
where  S.sid = R.sid  and B.bid = R.bid
and    (B.color = 'red' or B.color = 'blue');

-- Q17
select DISTINCT S.sid
from   Sailors S, Boats B1, Reserves R1, 
                  Boats B2, Reserves R2
where  S.sid = R1.sid and B1.bid = R1.bid
and    S.sid = R2.sid and B2.bid = R2.bid   
and    B1.color = 'red' 
and    B2.color = 'blue';

-- Q18
select DISTINCT S.sid
from   Sailors S, Boats B, Reserves R
where  S.sid = R.sid and    B.bid = R.bid
and    B.color = 'red'
UNION
select DISTINCT S.sid
from   Sailors S, Boats B, Reserves R
where  S.sid = R.sid and    B.bid = R.bid
and    B.color = 'blue';

-- Q19
select DISTINCT S.sid
from   Sailors S, Boats B, Reserves R
where  S.sid = R.sid and    B.bid = R.bid
and    B.color = 'red'
INTERSECT
select DISTINCT S.sid
from   Sailors S, Boats B, Reserves R
where  S.sid = R.sid and    B.bid = R.bid
and    B.color = 'blue';

-- Q20
select DISTINCT S.sid
from   Sailors S, Boats B, Reserves R
where  S.sid = R.sid and    B.bid = R.bid
and    B.color = 'red'
EXCEPT
select DISTINCT S.sid
from   Sailors S, Boats B, Reserves R
where  S.sid = R.sid and    B.bid = R.bid
and    B.color = 'blue';

-- Q21
select distinct B.bid
from   Boats B, Reserves R, Sailors S
where  B.bid = R.bid
and    R.sid = S.sid
and    S.rating > 7;

-- Q22
select DISTINCT B.bid
from   Boats B, Reserves R, Sailors S
where  B.bid = R.bid
and    R.sid = S.sid
and    (S.rating > 7 or S.rating < 5);

-- Q23
select DISTINCT B.bid
from   Boats B, Reserves R, Sailors S
where  B.bid = R.bid
and    R.sid = S.sid
and    S.rating > 7 
UNION
select DISTINCT B.bid
from   Boats B, Reserves R, Sailors S
where  B.bid = R.bid
and    R.sid = S.sid
and    S.rating < 5;

-- Q24*
select B.bid
from   Reserves R, Sailors S
where  R.sid = S.sid
and    S.rating > 7 
INTERSECT
select B.bid
from   Reserves R, Sailors S
where  R.sid = S.sid
and    S.rating < 5;

-- Q25*
select B.bid
from   Reserves R, Sailors S
where  R.sid = S.sid
and    S.rating > 7 
INTERSECT
select B.bid
from   Reserves R, Sailors S
where  R.sid = S.sid
and    S.rating < 5;

-- Q26
select S.name
from   Sailors S, Reserves R
where  S.sid = R.sid
and    R.bid = 103;

-- Q27
select S.name
from   Sailors S
where S.sid in (select  R.sid 
    		     from    Reserves R 
    		     where   R.bid = 103);
-- Q28
select S.name
from   Boats B, Reserves R, Sailors S
where  B.bid = R.bid
and    R.sid = S.sid
and    B.color = 'red';

-- Q29
select S.name
from   Sailors S
where  S.sid in (select R.sid 
    	 	     from   Reserves R 
    		     where  R.bid in (select B.bid
				      from   Boats B
                                      where  B.color = 'red'));

-- Q30.a*
select distinct B.color 
from   Boats B, Reserves R, Sailors S
where  B.bid = R.bid
and    R.sid = S.sid
and    S.rating > 7;

-- Q30.b*
select distinct B.color
from   Boats B, Reserves R
where  B.bid = R.bid
and    R.sid in (select S.sid 
                 from   Sailors S
                 where  S.rating > 7);

-- Q31.a*
select distinct B.name 
from   Boats B, Reserves R
where  B.bid = R.bid
and    to_char(day, 'Mon') = 'Oct';

-- Q31.b*
select distinct B.name 
from   Boats B
where  B.bid in (select R.bid
                 from   Reserves R
                 where  to_char(day, 'Mon') = 'Oct');

-- Q32
select S.name
from   Sailors S
where  S.sid not in (select R.sid 
    	 	     from   Reserves R 
    		     where  R.bid in (select B.bid 
			   	      from   Boats B
                                      where  B.color = 'red'));

-- Q33
select S.name
from   Sailors S
where  S.sid in (select R.sid 
    	 	 from   Reserves R 
    		 where  R.bid not in (select B.bid 
		   	              from   Boats B
                                      where  B.color = 'red'));

-- Q34
select S.name, S.sid
from   Sailors S
where  not exists (select  *
    		   from    Reserves R 
    		   where   R.sid = S.sid);

-- Q35
select S.name, S.sid
from   Sailors S
where  not exists (select * 
                   from   Reserves R, Boats B 
                   where  R.sid = S.sid
                   and    R.bid = B.bid 
                   and    B.color = 'red');

-- Q36
select B.name, B.color
from   Boats B
where  not exists (select * 
                   from   Reserves R
                   where  R.bid = B.bid);

-- Q37
select AVG(age)
from   Sailors
where  rating = 10;

-- Q38
select COUNT(*)
from Sailors;

-- Q39
select COUNT(*), AVG(age), MIN(rating)
from Sailors;

-- Q40
select S1.name, S1.age
from   Sailors S1
where  S1.age = (select max(S2.age) from Sailors S2);

-- Q41
select COUNT(distinct age) num_unique_ages, COUNT(age) num_ages
from   Sailors;

-- Q42*
select COUNT(*)
from   Sailors S1
where  S1.age > (select MAX(S2.age) 
                 from   Sailors S2 
                 where  S2.rating = 10);

-- Q43*
select S1.sid, S1.name
from   Sailors S1
where  S1.rating > (select AVG(S2.rating) 
                    from   Sailors S2);

-- Q44
select    rating, MIN(age)
from      Sailors
group by  rating;

-- Q45
select    rating, MIN(age)
from      Sailors
group by  rating
having    count(*) > 1;

-- Q46*
select bid, count(*) as num_reservations
from   Reserves 
group  by bid
having count(*) >= 3;

-- Q47*
select B.bid, B.name, MIN(S.age), AVG(S.rating)
from   Boats B, Reserves R, Sailors S
where  B.bid = R.bid
and    R.sid = S.sid
and    B.color = 'red'
group by B.bid, B.name;

-- Q48*
select   R.sid, count (*)
from     Reserves R, Sailors S
where    R.sid = S.sid
and      S.age >= 20
group by R.sid;

-- Q49*
select sid, count(*)
from   Reserves
group by sid
having count(*) >=2;

-- Q50
select * 
from Reserves
order by bid;

-- Q51
select * 
from Reserves
order by bid desc, sid;

-- Q52
select   R.bid, count(*) num_reservations, avg(S.rating) avg_rating
from     Reserves R, Sailors S
where    R.sid = S.sid
group by R.bid
order by avg_rating;

