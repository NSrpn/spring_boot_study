-- Insert into genres
insert into genres(name) values('Лёгкое чтение');
insert into genres(name) values('Фантастика');
insert into genres(name) values('Боевики');
insert into genres(name) values('Детективы');
insert into genres(name) values('Триллер');
insert into genres(name) values('Крутой детектив');
insert into genres(name) values('Иронический детектив');
insert into genres(name) values('Про маньяков');
insert into genres(name) values('Шпионский детектив');
insert into genres(name) values('Криминальный детектив');
insert into genres(name) values('Классический детектив');
insert into genres(name) values('Политический детектив');
insert into genres(name) values('Фэнтези');
insert into genres(name) values('Романы');
insert into genres(name) values('Ужасы');
insert into genres(name) values('Приключения');
insert into genres(name) values('Серьёзное чтение');
insert into genres(name) values('Биографии');
insert into genres(name) values('Деловая_литература');
insert into genres(name) values('Деловая литература');
insert into genres(name) values('Управление экономикой');
insert into genres(name) values('Карьера');
insert into genres(name) values('Маркетинг, PR, реклама');
insert into genres(name) values('Финансы');
insert into genres(name) values('Бизнес-справочники');
insert into genres(name) values('Личные финансы');
insert into genres(name) values('Менеджмент');
insert into genres(name) values('Зарубежная деловая литература');
insert into genres(name) values('Личная эффективность');
insert into genres(name) values('Тайм-менеджмент');
insert into genres(name) values('Малый бизнес');
insert into genres(name) values('Продажи');
insert into genres(name) values('Стартапы и создание бизнеса');
insert into genres(name) values('Корпоративная культура');
insert into genres(name) values('Банковское дело');
insert into genres(name) values('Логистика');
insert into genres(name) values('Недвижимость');
insert into genres(name) values('Интернет-бизнес');
insert into genres(name) values('Ораторское искусство / риторика');
insert into genres(name) values('Привлечение клиентов и лояльность');
insert into genres(name) values('Делопроизводство');
insert into genres(name) values('Переговоры');
insert into genres(name) values('Государственное и муниципальное управление, политическое управление');
insert into genres(name) values('О бизнесе популярно');
insert into genres(name) values('Ценные бумаги / инвестиции');
insert into genres(name) values('Бухучет / налогообложение / аудит');
insert into genres(name) values('Российская практика');
insert into genres(name) values('Истории успеха');
insert into genres(name) values('Интернет-маркетинг');
insert into genres(name) values('Лидерство');
insert into genres(name) values('Проектный менеджмент');
insert into genres(name) values('Управление качеством');
insert into genres(name) values('Финансовый менеджмент');
insert into genres(name) values('Управление персоналом');
insert into genres(name) values('Бизнес-процессы');
insert into genres(name) values('Управление бизнесом');
insert into genres(name) values('Драматургия');
insert into genres(name) values('Античная драма');
insert into genres(name) values('Комедия');
insert into genres(name) values('Сценарий');
insert into genres(name) values('Драма, пьеса');

update genres
    set parent_id = (select id from genres where name = 'Лёгкое чтение')
where name in ('Фантастика', 'Боевики', 'Детективы', 'Фэнтези', 'Романы', 'Ужасы', 'Приключения');

update genres
    set parent_id = (select id from genres where name = 'Детективы')
where name in ('Триллер', 'Крутой детектив', 'Иронический детектив', 'Про маньяков', 'Шпионский детектив', 'Криминальный детектив', 'Классический детектив', 'Политический детектив');

update genres
    set parent_id = (select id from genres where name = 'Серьёзное чтение')
where name in ('Биографии');

update genres
    set parent_id = (select id from genres where name = 'Деловая_литература')
where name in ('Деловая литература', 'Управление экономикой', 'Карьера', 'Маркетинг, PR, реклама',
                'Финансы','Бизнес-справочники','Личные финансы','Менеджмент','Зарубежная деловая литература',
                'Личная эффективность','Тайм-менеджмент','Малый бизнес','Продажи','Стартапы и создание бизнеса',
                'Корпоративная культура','Банковское дело','Логистика','Недвижимость','Интернет-бизнес',
                'Ораторское искусство / риторика','Привлечение клиентов и лояльность','Делопроизводство',
                'Переговоры','Государственное и муниципальное управление, политическое управление','О бизнесе популярно',
                'Ценные бумаги / инвестиции','Бухучет / налогообложение / аудит','Российская практика',
                'Истории успеха','Интернет-маркетинг','Лидерство','Проектный менеджмент','Управление качеством',
                'Финансовый менеджмент','Управление персоналом','Бизнес-процессы','Управление бизнесом');

update genres set name = 'Деловая литература' where name = 'Деловая_литература';

update genres
    set parent_id = (select id from genres where name = 'Драматургия')
where name in ('Античная драма', 'Комедия', 'Сценарий', 'Драма, пьеса');

insert into tags(title) values('современная литература');
insert into tags(title) values('классическая литература');
insert into tags(title) values('зарубежная литература');
insert into tags(title) values('фэнтези');
insert into tags(title) values('английская литература');
insert into tags(title) values('русская литература');
insert into tags(title) values('американская литература');
insert into tags(title) values('фантастика');
insert into tags(title) values('детская литература');
insert into tags(title) values('детектив');
insert into tags(title) values('любовь');
insert into tags(title) values('мистика');
insert into tags(title) values('юмор');
insert into tags(title) values('приключения');
insert into tags(title) values('сказка');
insert into tags(title) values('французская литература');
insert into tags(title) values('англия');
insert into tags(title) values('художественная литература');
insert into tags(title) values('психология');
insert into tags(title) values('философия');
insert into tags(title) values('экранизировано');
insert into tags(title) values('любимое');
insert into tags(title) values('антиутопия');
insert into tags(title) values('books you must read before you die');
insert into tags(title) values('роман');
insert into tags(title) values('франция');
insert into tags(title) values('дайте две');
insert into tags(title) values('young adult');
insert into tags(title) values('война');
insert into tags(title) values('история');
insert into tags(title) values('флэшмоб 2016');
insert into tags(title) values('детство');
insert into tags(title) values('жизнь');
insert into tags(title) values('драма');
insert into tags(title) values('россия');
insert into tags(title) values('книжное путешествие');
insert into tags(title) values('советская литература');
insert into tags(title) values('триллер');
insert into tags(title) values('америка');
insert into tags(title) values('немецкая литература');
insert into tags(title) values('вампиры');
insert into tags(title) values('школьная программа');
insert into tags(title) values('рассказы');
insert into tags(title) values('магия');
insert into tags(title) values('дети');
insert into tags(title) values('русская классика');
insert into tags(title) values('флэшмоб 2015');
insert into tags(title) values('биография');
insert into tags(title) values('english');