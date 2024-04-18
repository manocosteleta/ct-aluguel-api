-- Abaixo estão listados os scripts para reiniciar as sequences

DO $$
DECLARE
    max_id_cta_casa INT;
BEGIN
    -- Obter o número máximo da coluna ID da tabela cta_casa
    SELECT MAX(id) INTO max_id_cta_casa FROM public.cta_casa;

    -- Reiniciar a sequence para continuar a partir do próximo número após o máximo encontrado
    PERFORM setval('seq_cta_casa_id', COALESCE(max_id_cta_casa, 1), false);
    RAISE NOTICE 'Sequence % reiniciada para %', 'seq_cta_casa_id', COALESCE(max_id_cta_casa, 0) + 1;
END $$;

DO $$
DECLARE
    max_id_cta_inquilino INT;
BEGIN
    -- Obter o número máximo da coluna ID da tabela cta_inquilino
    SELECT MAX(id) INTO max_id_cta_inquilino FROM public.cta_inquilino;

    -- Reiniciar a sequence para continuar a partir do próximo número após o máximo encontrado
    PERFORM setval('seq_cta_inquilino_id', COALESCE(max_id_cta_inquilino, 1), false);
    RAISE NOTICE 'Sequence % reiniciada para %', 'seq_cta_inquilino_id', COALESCE(max_id_cta_inquilino, 0) + 1;
END $$;

DO $$
DECLARE
    max_id_cta_contrato INT;
BEGIN
    -- Obter o número máximo da coluna ID da tabela cta_contrato
    SELECT MAX(id) INTO max_id_cta_contrato FROM public.cta_contrato;

    -- Reiniciar a sequence para continuar a partir do próximo número após o máximo encontrado
    PERFORM setval('seq_cta_contrato_id', COALESCE(max_id_cta_contrato, 1), false);
    RAISE NOTICE 'Sequence % reiniciada para %', 'seq_cta_contrato_id', COALESCE(max_id_cta_contrato, 0) + 1;
END $$;

DO $$
DECLARE
    max_id_cta_pagamento INT;
BEGIN
    -- Obter o número máximo da coluna ID da tabela cta_pagamento
    SELECT MAX(id) INTO max_id_cta_pagamento FROM public.cta_pagamento;

    -- Reiniciar a sequence para continuar a partir do próximo número após o máximo encontrado
    PERFORM setval('seq_cta_pagamento_id', COALESCE(max_id_cta_pagamento, 1), false);
    RAISE NOTICE 'Sequence % reiniciada para %', 'seq_cta_pagamento_id', COALESCE(max_id_cta_pagamento, 0) + 1;
END $$;

DO $$
DECLARE
    max_id_cta_aluguel INT;
BEGIN
    -- Obter o número máximo da coluna ID da tabela cta_aluguel
    SELECT MAX(id) INTO max_id_cta_aluguel FROM public.cta_aluguel;

    -- Reiniciar a sequence para continuar a partir do próximo número após o máximo encontrado
    PERFORM setval('seq_cta_aluguel_id', COALESCE(max_id_cta_aluguel, 1), false);
    RAISE NOTICE 'Sequence % reiniciada para %', 'seq_cta_aluguel_id', COALESCE(max_id_cta_aluguel, 0) + 1;
END $$;

DO $$
DECLARE
    max_id_cta_locatario INT;
BEGIN
    -- Obter o número máximo da coluna ID da tabela cta_locatario
    SELECT MAX(id) INTO max_id_cta_locatario FROM public.cta_locatario;

    -- Reiniciar a sequence para continuar a partir do próximo número após o máximo encontrado
    PERFORM setval('seq_cta_locatario_id', COALESCE(max_id_cta_locatario, 1), false);
    RAISE NOTICE 'Sequence % reiniciada para %', 'seq_cta_locatario_id', COALESCE(max_id_cta_locatario, 0) + 1;
END $$;
