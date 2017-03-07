with recursive Descendants(parent, child) as (
 select parent, child 
    FROM Parent_Of P
 UNION ALL
 select P.parent, Descendants.child 
    from Parent_Of P
    JOIN Descendants on P.child = Descendants.parent)
    select parent, child from Descendants
    ORDER BY parent ASC;