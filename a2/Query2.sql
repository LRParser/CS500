-- Q60
select A.name as animal_name, 
       H.name as habitat_name
from   Animals A, Habitats H
where  A.hid = H.hid;

-- Q61
select A.name as animal_name, 
       H.name as habitat_name
from   Animals A left outer join Habitats H
on     (A.hid = H.hid);

-- Q62
select A.name as animal_name, 
       H.name as habitat_name
from   Animals A right outer join Habitats H
on     (A.hid = H.hid);

-- Q63
select A.name as animal_name, 
       H.name as habitat_name
from   Animals A full outer join Habitats H
on     (A.hid = H.hid);

-- Q64
select A.name as animal_name, H.name as habitat_name
from   Animals A left outer join Habitats H
on     (A.hid = H.hid)
where  A.name like '%o%';

-- Q65
select H.name as habitat_name, count(*)
from   Animals A full outer join Habitats H
on     (A.hid = H.hid)
group by  H.name
having count(*) = 1;

-- Q66
select H.name as habitat_name, count(*)
from   Animals A, Habitats H
where  A.hid = H.hid
group by  H.name
having count(*) = 1;

-- Q67.a*

-- Q67.b*

-- Q67.c*

-- Q68
insert into Animals (aid, name, hid)
values (6, 'zebra', 101);

-- Q69
insert into Animals (aid, name) 
values (7, 'rhinoceros');

-- Q70
delete from Animals 
where name = 'zebra';

-- Q71
delete from Animals 
where hid = 102;

-- Q72
delete from Animals 
where hid is null;

-- Q73
update Animals 
set    hid = 101
where  hid is null;

-- Q74
update Animals 
set    name = upper(name), 
       hid = 101;
