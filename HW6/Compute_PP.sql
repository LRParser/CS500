delete from Q;
delete from F1;
delete from F2;
delete from F3;
delete from C2;
delete from C3;
delete from R2;
delete from R3;
delete from PD_R3;

insert into Q (supp, conf, prot) values (500, 0.55, 1.0);

insert into F1 (attr, val, supp) 
  ( select attr, val, count(*) as supp
    from Pro_Publica, Q 
    group by attr, val
    having count(*) >= (select supp from Q));

-- YOUR CODE GOES HERE

-- ALLOWED:
-- you may but don't have to use the provided tables: F2, F3, C2, C3 as part 
-- all valid SQL queries are fine here: insert, delete, update
-- you may create additional helper tables if you like

-- NOT ALLOWED:
-- you may NOT use any procedural code: no for loops and the like are allowed

-- OUTPUT MUST GO INTO THESE RELATIONS, DON'T CHANGE THEIR SCHEMAS:
-- insert into R2 (attr1, val1, attr2, val2, supp, conf)
-- (...);

-- insert into R3 (attr1, val1, attr2, val2, attr3, val3, supp, conf)
-- (...);

-- insert into PD_R3 (attr1, val1, attr2, val2, attr3, val3, supp, conf, prot) 
--  (...);

