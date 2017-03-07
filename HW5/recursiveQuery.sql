with recursive Descendants(parent, child) as (
 select parent, child
    FROM Parent_Of P
 UNION ALL
 select P.parent, Descendants.child
    from Parent_Of P
    JOIN Descendants on P.child = Descendants.parent)
    select D.parent as ancestor, D.child as descendant
    from Descendants D, Person P1, Person P2
    WHERE D.parent = P1.name
    AND D.child = P2.name
    AND P1.gender = P2.gender
    ORDER BY parent ASC;
