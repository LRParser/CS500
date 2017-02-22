drop table UserEducationExperience_has;
drop table UserWorkExperience_has;
drop table Page_Post;
drop table Group_Post;

drop table Owns_Group;
drop table Owns_Page;
drop table User_Post;
drop table User_;


create table User_ (
    id int primary key,
    name text not null, 
    about text,
    email text, 
    is_verified boolean not null,
    profile_picture boolean not null,
    contact_address text,
    likes int,
    friends_count int,
    member_since date
    );
    
create table UserEducationExperience_has(
    id int primary key,
    school text,
    studied_with text,
    user_id int not null,
    foreign key (user_id) references User_(id) on delete cascade );
    
create table UserWorkExperience_has(
    id int primary key,
    employer text,
    user_id int not null,
    foreign key (user_id) references User_(id) on delete cascade );
    
create table Owns_Group(
    id int primary key,
    name text not null, 
    about text,
    email text, 
    is_verified boolean not null,
    profile_picture boolean not null,
    contact_address text,
    member_count int not null,
    update_date date not null,
    privacy text,
    created date not null,
    user_id int not null,
    foreign key (user_id) references User_(id) on delete cascade );
    
    
    create table Owns_Page(
    id int primary key,
    name text not null, 
    about text,
    email text, 
    is_verified boolean not null,
    profile_picture boolean not null,
    contact_address text,
    fan_count int not null,
    founded date not null,
    location text,
    were_here_count int,
    category text not null,
    overall_star_rating int,
    user_id int not null,
    foreign key (user_id) references User_(id) on delete cascade );

create table User_Post(
    id int primary key,
    update_date date not null,
    name text,
    reactions text,
    shares_count int,
    message text,
    user_id int not null,
    foreign key (user_id) references User_(id) on delete cascade );
    
create table Page_Post(
    id int primary key,
    update_date date not null,
    name text,
    reactions text,
    shares_count int,
    message text,
    page_id int not null,
    foreign key (page_id) references Owns_Page(id) on delete cascade );    
    
create table Group_Post(
    id int primary key,
    update_date date not null,
    name text,
    reactions text,
    shares_count int,
    message text,
    group_id int not null,
    foreign key (group_id) references Owns_Group(id) on delete cascade );        
   
    
    
    
insert into User_ values(4536, 'Mike Kain', 'Fun loving, adventurous', 'mkain@gmail.com', false, true, 
                         'Philadelphia, PA', 32, 143, '2009-10-05');
insert into User_ values(8327, 'Tony Gunk', 'Master of disguise', 'gunk17@yahoo.com', false, true, 
                         'Pittsburg, PA', 1500, 37, '2004-06-09');
insert into User_ values(9045, 'George Zite', 'Creative, nasty, hothead, hip', 'gayzee@gmail.com', false, true, 
                         'New York City, NY', 200, 14, '2007-09-05');
insert into User_ values(1087, 'Kramer Coso', 'Crazy and unemployed', 'cosokram@gmail.com', false, false, 
                         'Harrisburg, PA', 5000, 350, '2009-08-07');
insert into User_ values(1324, 'Rachel Green', 'Compulsive Shopper', 'greenie@gmail.com', true, true, 
                         'Boston, MA', 54, 200, '2005-10-05');
insert into User_ values(1134, 'Walter White', 'High School Chemistry Teacher(hahaha- wicked laugh)', 'heisenberg@gmail.com', true, true, 
                         'Albuquerque, New Mexico', 97, 830, '2012-11-06');
insert into User_ values(1237, 'Brian Smith', 'Nicks fan at heart, cavs otherwise', 'bsmith@gmail.com', false, true, 
                         'Philadelphia, PA', 132, 2143, '2005-10-07');
insert into User_ values(1243, 'Scott Levine', 'Activist, computer scientist', 'levinescott@gmail.com', true, true, 
                         'Lancaster, PA', 323, 1433, '2009-02-06');
insert into User_ values(1336, 'Natalie Juretus', 'Parisian, love in the air', 'njuretus@gmail.com', false, true, 
                         'Allentown, PA', 372, 1243, '2015-12-25');
insert into User_ values(1936, 'Bert Macklin', 'Private Detective with average skill', 'bertm@gmail.com', false, false, 
                         'Scranton, PA', 73, 230, '2006-12-04');
                         
                         
                         
                         
insert into usereducationexperience_has values( 23, 'City Charter High School', null, 1324);
insert into usereducationexperience_has values( 34, 'Taylor Allderdice High School', 'Mike Kain', 1336);
insert into usereducationexperience_has values( 72, 'Cornell High School', null, 1134);
insert into usereducationexperience_has values( 97, 'City Charter High School', 'Scott Levine', 1237);
insert into usereducationexperience_has values( 89, 'City Charter High School', 'Brian Smith', 1243);
insert into usereducationexperience_has values( 83, 'Taylor Allderdice High School', 'Natalie Juretus', 4536);
insert into usereducationexperience_has values( 39, 'City Charter High School', null, 8327);
insert into usereducationexperience_has values( 19, 'City Charter High School', null, 9045);
insert into usereducationexperience_has values( 11, null, null, 1087);
insert into usereducationexperience_has values( 43, null, null, 1936);



insert into userworkexperience_has values( 123, 'Comcast Corp',1324);
insert into userworkexperience_has values( 534, 'Google Inc.', 1336);
insert into userworkexperience_has values( 672, 'City Charter High School',1134);
insert into userworkexperience_has values( 697, 'Hahnemann Hospital',1237);
insert into userworkexperience_has values( 889, 'Childer Hospital, PA',1243);
insert into userworkexperience_has values( 803, 'Drexel University',4536);
insert into userworkexperience_has values( 379, 'Temple University',8327);
insert into userworkexperience_has values( 619, 'University of Pennsylvania',9045);
insert into userworkexperience_has values( 811, null,1087);
insert into userworkexperience_has values( 843, null,1936);

insert into Owns_Group values(123, 'Unisys Corp', 'Official Group of Unisys', 'admin@unisys.com', true, true, 
                         'Philadelphia, PA', 1500,'2016-10-05', 'Private', '2005-10-10', 4536);
insert into Owns_Group values(124, 'Drexel Netoworking', 'Official Group of Drexel Net', 'networks@drex.com', true, true, 
                         'Philadelphia, PA', 100,'2015-10-05', 'Private', '2009-10-10', 4536);
 insert into Owns_Group values(125, 'Privacy Lab', 'Official Group of Drexel Privacy Lab', 'admin@cs.drex.edu', true, true, 
                         'Philadelphia, PA', 10,'2016-11-05', 'Private', '2012-10-10', 1324);
insert into Owns_Group values(126, 'Machine Learning Group', 'Drexel Data Science Group', 'admin@ml.drexel.com', true, true, 
                         'Philadelphia, PA', 1500,'2016-10-05', 'Private', '2005-10-10', 8327);   
                         

insert into Owns_Page values(1, 'Secure Network', 'Official Page of Secure Net', 'admin@securenet.com', true, true, 
                         'Philadelphia, PA', 1500,'2016-10-05', '300N 165th Street', 400,'Tech', 5, 4536);
                         
insert into Owns_Page values(2, 'Firewalls-Admin', 'Official Page of Firewalls-Admin', 'admin@firewalls.com', true, true, 
                         'Philadelphia, PA', 150,'2014-10-05', '600N 65th Street', 200,'Security', 4, 4536);
insert into Owns_Page values(3, 'Data Science', 'Data Science is awesome', 'nonagon@datascience.com', true, true, 
                         'Philadelphia, PA', 357,'2009-10-05', '30S 100th Street', 132,'Tech', 3, 8327);                         
insert into Owns_Page values(4, 'Artificial Intelligence', 'Official Page of AI', 'admin@aiforlife.com', true, true, 
                         'Philadelphia, PA', 324,'2010-10-05', '300N 15th Street', 4200,'AI', 2, 1237);                         
insert into Owns_Page values(5, 'Privacy Lab', 'Official Page of Privacy Lab', 'admin@cs.privacy.com', true, true, 
                         'Philadelphia, PA', 70,'2013-12-25', '300 E 13th Street', 4080,'Privacy', 5, 1324);
                         
                                                
insert into User_Post values(1, '2017-02-10', 'Random Post', 'Like, Happy', 15, 'Very excited to go to the music festival in Miami', 8327);
insert into User_Post values(2, '2017-01-10', 'Update', 'Love, Happy', 25, 'All classes cancelled', 4536);
insert into User_Post values(3, '2016-12-10', 'Just In', 'Like', 215, 'I made the cut', 1087);
insert into User_Post values(4, '2015-03-11', 'On the fly', 'Like', 13, 'Create Networks on the fly using Network Simulator 3', 8327);



insert into Page_Post values(1500, '2017-02-10', 'New Post', 'Like, Happy', 215, 'Amused at the current happenings', 1);
insert into Page_Post values(1501, '2012-02-10', 'Old Post', 'Happy', 21, 'Time Flies', 2);
insert into Page_Post values(1502, '2017-02-10', 'Same Time Same Place', 'Like', 2315, 'It is a relative thing to be able to see it or not', 1);

insert into Group_Post values(31500, '2017-02-10', 'Some Post', 'Like, Happy', 2615, 'Not so amused', 124);
insert into Group_Post values(31501, '2012-02-10', 'Not so clear post', 'Happy', 721, 'Aragorn and Isildurs Heir', 123);
insert into Group_Post values(41502, '2017-02-10', 'Tribute', 'Like', 72315, 'Why so serious', 123);