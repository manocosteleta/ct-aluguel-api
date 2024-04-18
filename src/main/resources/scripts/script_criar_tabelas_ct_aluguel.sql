-- public.cta_casa definition

-- Drop table

-- DROP TABLE public.cta_casa;

CREATE TABLE public.cta_casa (
	id int8 NOT NULL DEFAULT nextval('seq_cta_casa_id'::regclass),
	descricao varchar NULL,
	endereco varchar NOT NULL,
	CONSTRAINT ct_casa_pk PRIMARY KEY (id)
);


-- public.cta_pessoa definition

-- Drop table

-- DROP TABLE public.cta_pessoa;

CREATE TABLE public.cta_pessoa (
	id int8 NOT NULL DEFAULT nextval('seq_cta_pessoa_id'::regclass),
	nome varchar NOT NULL,
	contato varchar NOT NULL,
	CONSTRAINT cta_pessoa_pk PRIMARY KEY (id)
);


-- public.cta_contrato definition

-- Drop table

-- DROP TABLE public.cta_contrato;

CREATE TABLE public.cta_contrato (
	id int8 NOT NULL DEFAULT nextval('seq_cta_casa_id'::regclass),
	id_casa int8 NOT NULL,
	id_inquilino int8 NOT NULL,
	id_locatario int8 NOT NULL,
	data_criacao timestamp NOT NULL,
	data_modificacao timestamp NULL,
	data_inicio_contrato timestamp NOT NULL,
	data_fim_contrrato timestamp NOT NULL,
	valoraluguel varchar NULL,
	CONSTRAINT cta_contrato_pk PRIMARY KEY (id),
	CONSTRAINT cta_contrato_id_casa_fk FOREIGN KEY (id_casa) REFERENCES public.cta_casa(id),
	CONSTRAINT cta_contrato_id_inquilino_fk FOREIGN KEY (id_inquilino) REFERENCES public.cta_pessoa(id),
	CONSTRAINT cta_contrato_id_locatario_fk FOREIGN KEY (id_locatario) REFERENCES public.cta_pessoa(id)
);


-- public.cta_aluguel definition

-- Drop table

-- DROP TABLE public.cta_aluguel;

CREATE TABLE public.cta_aluguel (
	id int8 NOT NULL DEFAULT nextval('seq_cta_aluguel_id'::regclass),
	status bpchar(1) NOT NULL, -- A - ABERTO¶P - PAGO
	id_contrato int8 NOT NULL,
	mes_referencia int4 NOT NULL,
	CONSTRAINT cta_aluguel_check_mes_referencia CHECK (((mes_referencia >= 1) AND (mes_referencia <= 12))),
	CONSTRAINT cta_aluguel_check_status CHECK ((status = ANY (ARRAY['A'::bpchar, 'P'::bpchar]))),
	CONSTRAINT cta_aluguel_pk PRIMARY KEY (id),
	CONSTRAINT cta_aluguel_fk FOREIGN KEY (id_contrato) REFERENCES public.cta_contrato(id)
);

-- Column comments

COMMENT ON COLUMN public.cta_aluguel.status IS 'A - ABERTO
P - PAGO';


-- public.cta_pagamento definition

-- Drop table

-- DROP TABLE public.cta_pagamento;

CREATE TABLE public.cta_pagamento (
	id int8 NOT NULL DEFAULT nextval('seq_cta_pagamento_id'::regclass),
	descricao varchar NULL,
	valor_pago numeric(10, 2) NOT NULL,
	status bpchar(1) NOT NULL, -- T - Total¶P - PARCIAL
	id_aluguel int8 NOT NULL,
	CONSTRAINT cta_pagamento_check CHECK ((status = ANY (ARRAY['T'::bpchar, 'P'::bpchar]))),
	CONSTRAINT cta_pagamento_pk PRIMARY KEY (id),
	CONSTRAINT cta_pagamento_fk FOREIGN KEY (id_aluguel) REFERENCES public.cta_aluguel(id)
);

-- Column comments

COMMENT ON COLUMN public.cta_pagamento.status IS 'T - Total
P - PARCIAL';