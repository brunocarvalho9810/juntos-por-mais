INSERT INTO `db_juntos`.`tb_entidade` (`cpfcnpj`, `nome`, `email`, `senha`, `pix_email`, `pix_cpfcnpj`, `pix_aleat`, `agencia`, `conta`, `caixa`) VALUES ('55098428068', 'Dion Fyegil', 'fyegil@gmail.com', 'senha123', 'fyegil@gmail.com', null, 'lkajoi1u2j1l2iu190u1n3j1b2giudq', '0001', '00001923', 199.80);
INSERT INTO `db_juntos`.`tb_entidade` (`cpfcnpj`, `nome`, `email`, `senha`, `pix_email`, `pix_cpfcnpj`, `pix_aleat`, `agencia`, `conta`, `caixa`) VALUES ('07554002082', 'Maguvu Orkeauk', 'maguvu12@gmail.com', 'senha123', null, '07554002082', null, '1203', '000123014', 1892.21);
INSERT INTO `db_juntos`.`tb_entidade` (`cpfcnpj`, `nome`, `email`, `senha`, `pix_email`, `pix_cpfcnpj`, `pix_aleat`, `agencia`, `conta`, `caixa`) VALUES ('20742502000103', 'Malvuoadar Riwosa', 'malvuoada1992@outlook.com', 'senha123',  'malvuoada1992@outlook.com', '20742502000103', null, '0201', '012201983', 0);
INSERT INTO `db_juntos`.`tb_entidade` (`cpfcnpj`, `nome`, `email`, `senha`, `pix_email`, `pix_cpfcnpj`, `pix_aleat`, `agencia`, `conta`, `caixa`) VALUES ('22985776000140', 'Koelrion Huen', 'huen1010@bol.com.br', 'senha123', 'huen1010@bol.com.br', null, 'alkjo1il2u3oj21@iuh2iuh1', null, null, 129.82);

INSERT INTO `db_juntos`.`tb_comprovante` (`data`, `descricao`, `imagem`, `titulo`, `valor`, `doacao`) VALUES ('2021-02-10', 'Nota fiscal Supermercado Bretas', 'https://ibb.co/5xX5f9s', 'Nota Fiscal', 1999.90, false);
INSERT INTO `db_juntos`.`tb_comprovante` (`data`, `descricao`, `imagem`, `titulo`, `valor`, `doacao`) VALUES ('2020-10-19', 'Compra Sexta basica', 'https://ibb.co/Q94r2wH', 'Compras', 139.90, false);
INSERT INTO `db_juntos`.`tb_comprovante` (`data`, `descricao`, `imagem`, `titulo`, `valor`, `doacao`) VALUES ('2020-09-15', 'Doação da Rita', 'https://ibb.co/pXKkGfk', 'Doação', 199.00, true);
INSERT INTO `db_juntos`.`tb_comprovante` (`data`, `descricao`, `imagem`, `titulo`, `valor`, `doacao`) VALUES ('2020-10-12', 'Doação do Ricardo', 'https://ibb.co/t3KVrsm', 'Doação', 189.90, true);
INSERT INTO `db_juntos`.`tb_comprovante` (`data`, `descricao`, `imagem`, `titulo`, `valor`, `doacao`) VALUES ('2021-08-12', 'Compra Leite Supermercado Bahamas', 'https://ibb.co/5xX5f9s', 'Compra Supermercado', 169.90, false);
INSERT INTO `db_juntos`.`tb_comprovante` (`data`, `descricao`, `imagem`, `titulo`, `valor`, `doacao`) VALUES ('2021-10-12', 'Pix do Alexandre', 'https://ibb.co/MpSbkc0', 'Pix', 4299.99, true);

INSERT INTO `db_juntos`.`tb_entidade_comprovantes` (`entidade_id`, `comprovantes_id`) VALUES (1, 1);
INSERT INTO `db_juntos`.`tb_entidade_comprovantes` (`entidade_id`, `comprovantes_id`) VALUES (1, 2);
INSERT INTO `db_juntos`.`tb_entidade_comprovantes` (`entidade_id`, `comprovantes_id`) VALUES (3, 3);
INSERT INTO `db_juntos`.`tb_entidade_comprovantes` (`entidade_id`, `comprovantes_id`) VALUES (4, 4);
INSERT INTO `db_juntos`.`tb_entidade_comprovantes` (`entidade_id`, `comprovantes_id`) VALUES (4, 5);
INSERT INTO `db_juntos`.`tb_entidade_comprovantes` (`entidade_id`, `comprovantes_id`) VALUES (3, 6);