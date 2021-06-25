-- Insert to Authors
insert into authors (title, history, img_file_name) values ('Drucie Goodbourn', 'author of exploit real-time e-commerce', 'default_face.png');
insert into authors (title, history, img_file_name) values ('Marcia Aggiss', 'author of utilize real-time interfaces', 'default_face.png');
insert into authors (title, history, img_file_name) values ('Giovanni Bigg', 'author of extend strategic e-services', 'default_face.png');
insert into authors (title, history, img_file_name) values ('Duffie Eynon', 'author of iterate integrated solutions', 'default_face.png');
insert into authors (title, history, img_file_name) values ('Anselma McKennan', 'author of cultivate magnetic e-commerce', 'default_face.png');
insert into authors (title, history, img_file_name) values ('Gert Kira', 'author of architect vertical ROI', 'default_face.png');
insert into authors (title, history, img_file_name) values ('Clerc Djakovic', 'author of disintermediate extensible architectures', 'default_face.png');
insert into authors (title, history, img_file_name) values ('Stacee Elsy', 'author of extend leading-edge methodologies', 'default_face.png');
insert into authors (title, history, img_file_name) values ('Dorotea Bonhill', 'author of integrate one-to-one systems', 'default_face.png');
insert into authors (title, history, img_file_name) values ('Minni Bunney', 'author of revolutionize 24/7 infrastructures', 'default_face.png');
insert into authors (title, history, img_file_name) values ('Berty Gandley', 'author of enhance innovative e-services', 'default_face.png');
insert into authors (title, history, img_file_name) values ('Raynard Tesdale', 'author of maximize 24/365 e-tailers', 'default_face.png');
insert into authors (title, history, img_file_name) values ('Joanna Hutfield', 'author of scale integrated architectures', 'default_face.png');
insert into authors (title, history, img_file_name) values ('Dannie Glidder', 'author of e-enable frictionless web services', 'default_face.png');
insert into authors (title, history, img_file_name) values ('Timmie Adshede', 'author of strategize B2B channels', 'default_face.png');
insert into authors (title, history, img_file_name) values ('Fernando Neads', 'author of syndicate compelling deliverables', 'default_face.png');
insert into authors (title, history, img_file_name) values ('Teddy Guilliland', 'author of utilize bleeding-edge users', 'default_face.png');
insert into authors (title, history, img_file_name) values ('Paloma Grebert', 'author of cultivate 24/365 networks', 'default_face.png');
insert into authors (title, history, img_file_name) values ('Kristos Usher', 'author of embrace plug-and-play platforms', 'default_face.png');
insert into authors (title, history, img_file_name) values ('Darcey Rohmer', 'author of target innovative paradigms', 'default_face.png');
insert into authors (title, history, img_file_name) values ('Cristie Isacsson', 'author of generate open-source e-business', 'default_face.png');
insert into authors (title, history, img_file_name) values ('Lindsay Coutthart', 'author of implement user-centric e-markets', 'default_face.png');
insert into authors (title, history, img_file_name) values ('Helyn Schneidar', 'author of utilize magnetic supply-chains', 'default_face.png');
insert into authors (title, history, img_file_name) values ('Bette-ann Askem', 'author of e-enable dot-com supply-chains', 'default_face.png');
insert into authors (title, history, img_file_name) values ('Dom Robuchon', 'author of facilitate efficient eyeballs', 'default_face.png');
-- Insert to books
insert into books (author_id, title, priceOld, price, add_date) values ((select id from authors where title='Drucie Goodbourn'), 'exploit real-time e-commerce', 203.23, 43.37, current_date);
insert into books (author_id, title, priceOld, price, add_date) values ((select id from authors where title='Marcia Aggiss'), 'utilize real-time interfaces', 260.31, 35.96, current_date);
insert into books (author_id, title, priceOld, price, add_date) values ((select id from authors where title='Giovanni Bigg'), 'extend strategic e-services', 272.00, 151.04, current_date);
insert into books (author_id, title, priceOld, price, add_date) values ((select id from authors where title='Duffie Eynon'), 'iterate integrated solutions', 271.58, 141.40, current_date);
insert into books (author_id, title, priceOld, price, add_date) values ((select id from authors where title='Anselma McKennan'), 'cultivate magnetic e-commerce', 278.43, 54.44, current_date);
insert into books (author_id, title, priceOld, price, add_date) values ((select id from authors where title='Gert Kira'), 'architect vertical ROI', 282.54, 102.61, current_date);
insert into books (author_id, title, priceOld, price, add_date) values ((select id from authors where title='Clerc Djakovic'), 'disintermediate extensible architectures', 295.38, 181.27, current_date);
insert into books (author_id, title, priceOld, price, add_date) values ((select id from authors where title='Stacee Elsy'), 'extend leading-edge methodologies', 283.08, 97.96, current_date);
insert into books (author_id, title, priceOld, price, add_date) values ((select id from authors where title='Dorotea Bonhill'), 'integrate one-to-one systems', 258.51, 52.25, current_date);
insert into books (author_id, title, priceOld, price, add_date) values ((select id from authors where title='Minni Bunney'), 'revolutionize 24/7 infrastructures', 260.79, 33.69, current_date);
insert into books (author_id, title, priceOld, price, add_date) values ((select id from authors where title='Berty Gandley'), 'enhance innovative e-services', 256.54, 160.98, current_date);
insert into books (author_id, title, priceOld, price, add_date) values ((select id from authors where title='Raynard Tesdale'), 'maximize 24/365 e-tailers', 262.07, 34.06, current_date);
insert into books (author_id, title, priceOld, price, add_date) values ((select id from authors where title='Joanna Hutfield'), 'scale integrated architectures', 257.66, 32.97, current_date);
insert into books (author_id, title, priceOld, price, add_date) values ((select id from authors where title='Dannie Glidder'), 'e-enable frictionless web services', 288.19, 90.52, current_date);
insert into books (author_id, title, priceOld, price, add_date) values ((select id from authors where title='Timmie Adshede'), 'strategize B2B channels', 232.27, 44.83, current_date);
insert into books (author_id, title, priceOld, price, add_date) values ((select id from authors where title='Fernando Neads'), 'syndicate compelling deliverables', 287.45, 101.89, current_date);
insert into books (author_id, title, priceOld, price, add_date) values ((select id from authors where title='Teddy Guilliland'), 'utilize bleeding-edge users', 281.37, 146.21, current_date);
insert into books (author_id, title, priceOld, price, add_date) values ((select id from authors where title='Paloma Grebert'), 'cultivate 24/365 networks', 270.99, 184.76, current_date);
insert into books (author_id, title, priceOld, price, add_date) values ((select id from authors where title='Kristos Usher'), 'embrace plug-and-play platforms', 278.36, 77.71, current_date);
insert into books (author_id, title, priceOld, price, add_date) values ((select id from authors where title='Darcey Rohmer'), 'target innovative paradigms', 298.94, 130.01, current_date);
insert into books (author_id, title, priceOld, price, add_date) values ((select id from authors where title='Cristie Isacsson'), 'generate open-source e-business', 276.57, 113.25, current_date);
insert into books (author_id, title, priceOld, price, add_date) values ((select id from authors where title='Lindsay Coutthart'), 'implement user-centric e-markets', 254.70, 115.31, current_date);
insert into books (author_id, title, priceOld, price, add_date) values ((select id from authors where title='Helyn Schneidar'), 'utilize magnetic supply-chains', 279.70, 77.86, current_date);
insert into books (author_id, title, priceOld, price, add_date) values ((select id from authors where title='Bette-ann Askem'), 'e-enable dot-com supply-chains', 297.83, 110.15, current_date);
insert into books (author_id, title, priceOld, price, add_date) values ((select id from authors where title='Dom Robuchon'), 'facilitate efficient eyeballs', 232.30, 131.48, current_date);

-- Insert into genres
insert into genres(title) values('Лёгкое чтение');
insert into genres(title) values('Фантастика');
insert into genres(title) values('Боевики');
insert into genres(title) values('Детективы');
insert into genres(title) values('Триллер');
insert into genres(title) values('Крутой детектив');
insert into genres(title) values('Иронический детектив');
insert into genres(title) values('Про маньяков');
insert into genres(title) values('Шпионский детектив');
insert into genres(title) values('Криминальный детектив');
insert into genres(title) values('Классический детектив');
insert into genres(title) values('Политический детектив');
insert into genres(title) values('Фэнтези');
insert into genres(title) values('Романы');
insert into genres(title) values('Ужасы');
insert into genres(title) values('Приключения');
insert into genres(title) values('Серьёзное чтение');
insert into genres(title) values('Биографии');
insert into genres(title) values('Деловая_литература');
insert into genres(title) values('Деловая литература');
insert into genres(title) values('Управление экономикой');
insert into genres(title) values('Карьера');
insert into genres(title) values('Маркетинг, PR, реклама');
insert into genres(title) values('Финансы');
insert into genres(title) values('Бизнес-справочники');
insert into genres(title) values('Личные финансы');
insert into genres(title) values('Менеджмент');
insert into genres(title) values('Зарубежная деловая литература');
insert into genres(title) values('Личная эффективность');
insert into genres(title) values('Тайм-менеджмент');
insert into genres(title) values('Малый бизнес');
insert into genres(title) values('Продажи');
insert into genres(title) values('Стартапы и создание бизнеса');
insert into genres(title) values('Корпоративная культура');
insert into genres(title) values('Банковское дело');
insert into genres(title) values('Логистика');
insert into genres(title) values('Недвижимость');
insert into genres(title) values('Интернет-бизнес');
insert into genres(title) values('Ораторское искусство / риторика');
insert into genres(title) values('Привлечение клиентов и лояльность');
insert into genres(title) values('Делопроизводство');
insert into genres(title) values('Переговоры');
insert into genres(title) values('Государственное и муниципальное управление, политическое управление');
insert into genres(title) values('О бизнесе популярно');
insert into genres(title) values('Ценные бумаги / инвестиции');
insert into genres(title) values('Бухучет / налогообложение / аудит');
insert into genres(title) values('Российская практика');
insert into genres(title) values('Истории успеха');
insert into genres(title) values('Интернет-маркетинг');
insert into genres(title) values('Лидерство');
insert into genres(title) values('Проектный менеджмент');
insert into genres(title) values('Управление качеством');
insert into genres(title) values('Финансовый менеджмент');
insert into genres(title) values('Управление персоналом');
insert into genres(title) values('Бизнес-процессы');
insert into genres(title) values('Управление бизнесом');
insert into genres(title) values('Драматургия');
insert into genres(title) values('Античная драма');
insert into genres(title) values('Комедия');
insert into genres(title) values('Сценарий');
insert into genres(title) values('Драма, пьеса');

update genres
    set parent_id = (select id from genres where title = 'Лёгкое чтение')
where title in ('Фантастика', 'Боевики', 'Детективы', 'Фэнтези', 'Романы', 'Ужасы', 'Приключения');

update genres
    set parent_id = (select id from genres where title = 'Детективы')
where title in ('Триллер', 'Крутой детектив', 'Иронический детектив', 'Про маньяков', 'Шпионский детектив', 'Криминальный детектив', 'Классический детектив', 'Политический детектив');

update genres
    set parent_id = (select id from genres where title = 'Серьёзное чтение')
where title in ('Биографии');

update genres
    set parent_id = (select id from genres where title = 'Деловая_литература')
where title in ('Деловая литература', 'Управление экономикой', 'Карьера', 'Маркетинг, PR, реклама',
                'Финансы','Бизнес-справочники','Личные финансы','Менеджмент','Зарубежная деловая литература',
                'Личная эффективность','Тайм-менеджмент','Малый бизнес','Продажи','Стартапы и создание бизнеса',
                'Корпоративная культура','Банковское дело','Логистика','Недвижимость','Интернет-бизнес',
                'Ораторское искусство / риторика','Привлечение клиентов и лояльность','Делопроизводство',
                'Переговоры','Государственное и муниципальное управление, политическое управление','О бизнесе популярно',
                'Ценные бумаги / инвестиции','Бухучет / налогообложение / аудит','Российская практика',
                'Истории успеха','Интернет-маркетинг','Лидерство','Проектный менеджмент','Управление качеством',
                'Финансовый менеджмент','Управление персоналом','Бизнес-процессы','Управление бизнесом');

update genres set title = 'Деловая литература' where title = 'Деловая_литература';

update genres
    set parent_id = (select id from genres where title = 'Драматургия')
where title in ('Античная драма', 'Комедия', 'Сценарий', 'Драма, пьеса');

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