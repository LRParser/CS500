julia_cs500=> select * from Q;
 supp | conf | prot 
------+------+------
  500 | 0.55 |    1
(1 row)

julia_cs500=> select * from R2;
  attr1   | val1 |  attr2  | val2 | supp |       conf        
----------+------+---------+------+------+-------------------
 age      |   40 | vdecile |    1 |  899 | 0.828571428571429
 gender   |    1 | vdecile |    1 |  871 |  0.75021533161068
 age      |   50 | vdecile |    1 |  709 | 0.907810499359795
 marriage |    1 | vdecile |    1 | 2783 | 0.589493751323872
 age      |   20 | vdecile |    2 | 1006 | 0.807383627608347
 gender   |    0 | vdecile |    1 | 2908 | 0.616885871871023
 age      |   30 | vdecile |    1 | 1457 | 0.646693297825122
 race     |    1 | vdecile |    1 | 1949 | 0.552437641723356
 race     |    2 | vdecile |    1 | 1830 |  0.77971878994461
(9 rows)

julia_cs500=> select * from R3;
 attr1   | val1 |  attr2   | val2 |  attr3  | val3 | supp |       conf        
----------+------+----------+------+---------+------+------+-------------------
 gender   |    0 | marriage |    1 | vdecile |    1 | 2159 | 0.564002089864159
 age      |   20 | race     |    1 | vdecile |    2 |  726 | 0.830663615560641
 age      |   20 | gender   |    0 | vdecile |    2 |  832 | 0.827860696517413
 age      |   50 | gender   |    0 | vdecile |    1 |  554 | 0.899350649350649
 age      |   30 | marriage |    1 | vdecile |    1 | 1244 | 0.633078880407125
 age      |   30 | race     |    1 | vdecile |    1 |  866 | 0.581989247311828
 age      |   30 | race     |    2 | vdecile |    1 |  591 | 0.772549019607843
 age      |   40 | gender   |    0 | vdecile |    1 |  680 |   0.7981220657277
 age      |   20 | marriage |    1 | vdecile |    2 |  975 | 0.813856427378965
 gender   |    0 | race     |    2 | vdecile |    1 | 1379 |  0.76398891966759
 age      |   40 | marriage |    1 | vdecile |    1 |  630 | 0.800508259212198
 gender   |    1 | marriage |    1 | vdecile |    1 |  624 | 0.698768197088466
 age      |   30 | gender   |    0 | vdecile |    1 | 1109 |  0.61135611907387
 marriage |    1 | race     |    2 | vdecile |    1 | 1265 | 0.732908458864426
(14 rows)

julia_cs500=> select * from PD_R3;
  attr1   | val1 | attr2 | val2 |  attr3  | val3 | supp |       conf        |       prot       
----------+------+-------+------+---------+------+------+-------------------+------------------
 age      |   20 | race  |    1 | vdecile |    2 |  726 | 0.830663615560641 | 1.02883386181765
 age      |   30 | race  |    2 | vdecile |    1 |  591 | 0.772549019607843 | 1.19461423553636
 gender   |    0 | race  |    2 | vdecile |    1 | 1379 |  0.76398891966759 | 1.23846071778302
 marriage |    1 | race  |    2 | vdecile |    1 | 1265 | 0.732908458864426 |  1.2432845254398
(4 rows)

