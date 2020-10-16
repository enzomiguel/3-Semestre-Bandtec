insert into pais
(id, modelo)
values
(null, 'Grecia'),
(null, 'Italia'),
(null, 'Lisboa'),
(null, 'Barcelona');

insert into fabricante
(id, nome, pais_id)
values
(null, 'Fiat', 2),
(null, 'GM', 3),
(null, 'Honda', 4),
(null, 'Hyndai', 1);

insert into carro
(id, modelo, potencia, fabricante_id)
values
(null, 'Palio', 1.0, 1),
(null, 'Uno', 1.2, 1),
(null, 'Onix', 1.5, 2),
(null, 'Fit', 1.8, 3),
(null, 'City', 2.0, 3),
(null, 'HB20', 1.4, 4);