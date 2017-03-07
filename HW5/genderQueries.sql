 select DISTINCT R1.parent, R1.child, P1.gender as gender1, P2.gender as gender2
    FROM Parent_Of R1, Person P1, Person P2
    WHERE P1.name = R1.parent AND P2.name = R1.child
