1. **test** veritabanınızda **employee** isimli sütun bilgileri id(INTEGER), name VARCHAR(50), birthday DATE, email VARCHAR(100) olan bir tablo oluşturalım.

   ```sql
   CREATE TABLE employee(
       id SERIAL PRIMARY KEY,
       name VARCHAR(50) NOT NULL,
       birthday DATE,
       email VARCHAR(100)
   );
   ```

2. Oluşturduğumuz **employee** tablosuna 'Mockaroo' servisini kullanarak 50 adet veri ekleyelim.

   *Sembolik olarak gösterilmiştir.*

   ```sql
   insert into author (first_name, last_name, email, birthday) values ('Betti', 'Weddeburn', 'bwed0@nyts.com', '1920-08-27');
   insert into author (first_name, last_name, email, birthday) values ('Ebeneser', 'Sicely', 'esicely1@techcrunch.com', '1984-08-28');
   insert into author (first_name, last_name, email, birthday) values ('Gwenette', 'Dunnet', 'gdunnet2@phpbb.com', '1954-12-01');
   insert into author (first_name, last_name, email, birthday) values ('Orran', 'Brickham', 'obrickham3@dyndns.org', '1922-02-12');
   insert into author (first_name, last_name, email, birthday) values ('Cilka', 'Teape', 'cteape4@elegantthemes.com', '1930-02-09');
   insert into author (first_name, last_name, email, birthday) values ('Claybourne', 'Thelwll', 'cthelwll5@wp.com', '1925-12-05');
   insert into author (first_name, last_name, email, birthday) values ('Mariann', 'Gorce', null, null);
   insert into author (first_name, last_name, email, birthday) values ('Marquita', 'Gawke', 'mgawke7@wp.com', '1905-01-31');
   insert into author (first_name, last_name, email, birthday) values ('Dinnie', 'Furbank', 'dfurbank8@youtu.be', '1969-05-07');
   insert into author (first_name, last_name, email, birthday) values ('Genovera', 'Matthisson', 'gmatthisson9@zdnet.com', '1964-08-13');
   ```

3. Sütunların her birine göre diğer sütunları güncelleyecek 3 adet UPDATE işlemi yapalım.

   ```sql
   UPDATE employee SET name = 'Furkan' WHERE id=10;
   UPDATE employee SET birthday = '1922-02-12' WHERE name='Furkan';
   UPDATE employee SET email= 'xyz@abccom' WHERE birthday = '1922-02-12';
   ```

4. Sütunların her birine göre ilgili satırı silecek 4 adet DELETE işlemi yapalım.

   ````sql
   DELETE FROM employee WHERE name='Furkan';
   DELETE FROM employee WHERE birthday = '1922-02-12';
   DELETE FROM employee WHERE id=10;
   DELETE FROM employee WHERE email= 'xyz@abccom';
   ````

   