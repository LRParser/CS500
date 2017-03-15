julia_cs500=> select * from Q;
 supp | conf | prot 
------+------+------
  600 |  0.7 |  0.5
(1 row)

julia_cs500=> select * from R2;
 attr1  | val1 |  attr2  | val2 | supp |       conf        
--------+------+---------+------+------+-------------------
 age    |   40 | vdecile |    1 |  899 | 0.828571428571429
 gender |    1 | vdecile |    1 |  871 |  0.75021533161068
 age    |   50 | vdecile |    1 |  709 | 0.907810499359795
 age    |   20 | vdecile |    2 | 1006 | 0.807383627608347
 race   |    2 | vdecile |    1 | 1830 |  0.77971878994461
(5 rows)

julia_cs500=> select * from R3;
 attr1  | val1 |  attr2   | val2 |  attr3  | val3 | supp |       conf        
--------+------+----------+------+---------+------+------+-------------------
 age      |   20 | gender   |    0 | vdecile |    2 |  832 | 0.827860696517413
 age      |   40 | marriage |    1 | vdecile |    1 |  630 | 0.800508259212198
 marriage |    1 | race     |    2 | vdecile |    1 | 1265 | 0.732908458864426
 age      |   20 | race     |    1 | vdecile |    2 |  726 | 0.830663615560641
 age      |   20 | marriage |    1 | vdecile |    2 |  975 | 0.813856427378965
 gender   |    0 | race     |    2 | vdecile |    1 | 1379 |  0.76398891966759
 age      |   40 | gender   |    0 | vdecile |    1 |  680 |   0.7981220657277
(7 rows)

julia_cs500=> select * from PD_R3;
 attr1 | val1 | attr2 | val2 | attr3 | val3 | supp | conf | prot 
-------+------+-------+------+-------+------+------+------+------
 age   |   20 | race  |    1 | vdecile |    2 |  726 | 0.830663615560641 | 1.02883386181765
(1 row)

