CREATE EXTENSION IF NOT EXISTS "uuid-ossp";

CREATE TABLE "public"."customer" (
    "id" UUID DEFAULT uuid_generate_v1(),
    "name" text,
    "phone" text,
    "email" text,
    "credit_card_number" text,
    "address" text,
    "created_date" timestamp DEFAULT now(),
    "modified_date" timestamp DEFAULT now(),
    PRIMARY KEY ("id")
) TABLESPACE "pg_default";
