package com.example.progetto_sistematica;

import androidx.appcompat.app.AppCompatActivity;

public class ErrorCodeOBD extends AppCompatActivity {

    static String P0A00P0AD3 ="P0A00 Sensore temp.refrig.elettronica motore\n" +
            "P0A01 Sensore temp.refrig.elettronica motore\n" +
            "P0A02 Sensore temp.refrig.elettronica motore\n" +
            "P0A03 Sensore temp.refrig.elettronica motore\n" +
            "P0A04 Sensore temp.refrig.elettronica motore\n" +
            "P0A05 Pompa refrigerante elettronica motore\n" +
            "P0A06 Pompa refrigerante elettronica motore\n" +
            "P0A07 Pompa refrigerante elettronica motore\n" +
            "P0A08 Difetto convertitore DC/DC\n" +
            "P0A09 Difetto convertitore DC/DC\n" +
            "P0A0A Inter-lock sistema alto voltaggio\n" +
            "P0A0B Inter-lock sistema alto voltaggio\n" +
            "P0A0C Inter-lock sistema alto voltaggio\n" +
            "P0A0D Inter-lock sistema alto voltaggio\n" +
            "P0A0E Inter-lock sistema alto voltaggio\n" +
            "P0A0F Avviamento motore fallito\n" +
            "P0A10 Difetto convertitore DC/DC\n" +
            "P0A11 Abilitazione convertitore DC/DC\n" +
            "P0A12 Abilitazione convertitore DC/DC\n" +
            "P0A13 Abilitazione convertitore DC/DC\n" +
            "P0A14 Controllo A supporto motore\n" +
            "P0A15 Controllo A supporto motore\n" +
            "P0A16 Controllo A supporto motore\n" +
            "P0A17 Sensore coppia motore\n" +
            "P0A18 Sensore coppia motore - Fuori range\n" +
            "P0A19 Sensore coppia motore - Segnale basso\n" +
            "P0A1A Modulo di controllo del generatore\n" +
            "P0A1B Modulo di controllo azionamento motore A\n" +
            "P0A1C Modulo di controllo azionamento motore B\n" +
            "P0A1D Modulo di controllo Powertrain ibrido\n" +
            "P0A1E Modulo di controllo generatore\n" +
            "P0A1F Modulo di controllo energia batteria\n" +
            "P0A20 Modulo di controllo energia batteria\n" +
            "P0A21 Sensore coppia motore - segnale alto\n" +
            "P0A22 Sensore coppia generatore\n" +
            "P0A22 Sensore coppia generatore\n" +
            "P0A23 Sensore coppia generatore\n" +
            "P0A24 Sensore coppia generatore\n" +
            "P0A25 Sensore coppia generatore\n" +
            "P0A26 Spegnimento batteria ibrida\n" +
            "P0A28 Spegnimento batteria ibrida\n" +
            "P0A29 Spegnimento batteria ibrida\n" +
            "P0A2A Sensore temp.azionamento motore A\n" +
            "P0A2B Sensore temp.azionamento motore A\n" +
            "P0A2C Sensore temp.azionamento motore A\n" +
            "P0A2D Sensore temp.azionamento motore A\n" +
            "P0A2E Sensore temp.azionamento motore A\n" +
            "P0A2F Sovra temperatura azionamento motore A\n" +
            "P0A30 Sensore temp.azionamento motore B\n" +
            "P0A31 Sensore temp.azionamento motore B\n" +
            "P0A32 Sensore temp.azionamento motore B\n" +
            "P0A33 Sensore temp.azionamento motore B\n" +
            "P0A34 Sensore temp.azionamento motore B\n" +
            "P0A35 Sovra temperatura azionamento motore B\n" +
            "P0A36 Sensore temperatura generatore\n" +
            "P0A37 Sensore temperatura generatore\n" +
            "P0A38 Sensore temperatura generatore\n" +
            "P0A39 Sensore temperatura generatore\n" +
            "P0A3A Sensore temperatura generatore\n" +
            "P0A3B Sovra temperatura generatore\n" +
            "P0A3C Sovra temp.inverter azionam.motore A\n" +
            "P0A3D Sovra temp.inverter azionam.motore B\n" +
            "P0A3E Sovra temperatura inverter generatore\n" +
            "P0A3F Sensore posizione azionamento motore A\n" +
            "P0A40 Sensore posizione azionamento motore A\n" +
            "P0A41 Sensore posizione azionamento motore A\n" +
            "P0A42 Sensore posizione azionamento motore A\n" +
            "P0A43 Sensore posizione azionamento motore A\n" +
            "P0A44 Sensore posizione azionamento motore A\n" +
            "P0A45 Sensore posizione azionamento motore B\n" +
            "P0A46 Sensore posiz ione azionamento motore B\n" +
            "P0A47 Sensore posizione azionamento motore B\n" +
            "P0A48 Sensore posizione azionamento motore B\n" +
            "P0A49 Sensore posizione azionamento motore B\n" +
            "P0A4A Sensore posizione azionamento motore B\n" +
            "P0A4B Sensore di posizione del generatore\n" +
            "P0A4C Sensore di posizione del generatore\n" +
            "P0A4D Sensore di posizione del generatore\n" +
            "P0A4E Sensore di posizione del generatore\n" +
            "P0A4F Sensore di posizione del generatore\n" +
            "P0A50 Sensore di posizione del generatore\n" +
            "P0A51 Sensore corrente azionamento motore A\n" +
            "P0A52 Sensore corrente azionamento motore A\n" +
            "P0A53 Sensore corrente azionamento motore A\n" +
            "P0A54 Sensore corrente azionamento motore A\n" +
            "P0A55 Sensore corrente azionamento motore B\n" +
            "P0A56 Sensore corrente azionamento motore B\n" +
            "P0A57 Sensore corrente azionamento motore B\n" +
            "P0A58 Sensore corrente azionamento motore B\n" +
            "P0A59 Sensore generatore di corrente\n" +
            "P0A5A Sensore generatore di corrente\n" +
            "P0A5B Sensore generatore di corrente\n" +
            "P0A5C Sensore generatore di corrente\n" +
            "P0A5D Fase U azionamento motore A\n" +
            "P0A5E Fase U azionamento motore A\n" +
            "P0A5F Fase U azionamento motore A\n" +
            "P0A60 Fase V azionamento motore A\n" +
            "P0A61 Fase V azionamento motore A\n" +
            "P0A62 Fase V azionamento motore A\n" +
            "P0A63 Fase W azionamento motore A\n" +
            "P0A64 Fase W azionamento motore A\n" +
            "P0A65 Fase W azionamento motore A\n" +
            "P0A66 Fase U azionamento motore B\n" +
            "P0A67 Fase U azionamento motore B\n" +
            "P0A68 Fase U azionamento motore B\n" +
            "P0A69 Fase V azionamento motore B\n" +
            "P0A6a Fase V azionamento motore B\n" +
            "P0A6B Fase V azionamento motore B\n" +
            "P0A6C Fase W azionamento motore B\n" +
            "P0A6D Fase W azionamento motore B\n" +
            "P0A6E Fase W azionamento motore B\n" +
            "P0A6F Fase U generatore\n" +
            "P0A70 Fase U generatore\n" +
            "P0A71 Fase U generatore\n" +
            "P0A72 Fase V generatore\n" +
            "P0A73 Fase V generatore\n" +
            "P0A74 Fase V generatore\n" +
            "P0A75 Fase W generatore\n" +
            "P0A76 Fase W generatore\n" +
            "P0A77 Fase W generatore\n" +
            "P0A78 Inverter azionamento motore A\n" +
            "P0A79 Inverter azionamento motore B\n" +
            "P0A7A Inverter generatore\n" +
            "P0A7B Modulo controllo energia batteria MIL\n" +
            "P0A7C Sovra temperatura motore elettronico\n" +
            "P0A7D Stato di carica bassa batteria ibrida\n" +
            "P0A7E Sovra temp.pacco batteria ibrida\n" +
            "P0A7F Deterioramento pacco batteria ibrida\n" +
            "P0A80 Sostituzione pacco batteria ibrida\n" +
            "P0A81 Ventola 1 refrig.pacco batteria ibrida\n" +
            "P0A82 Ventola 1 refrig.pacco batteria ibrida\n" +
            "P0A83 Ventola 1 refrig.pacco batteria ibrida\n" +
            "P0A84 Ventola 1 refrig.pacco batteria ibrida\n" +
            "P0A85 Ventola 1 refrig.pacco batteria ibrida\n" +
            "P0A86 Sensore corrente alimentazione 14 Volt\n" +
            "P0A87 Sensore corrente alimentazione 14 Volt\n" +
            "P0A88 Sensore corrente alimentazione 14 Volt\n" +
            "P0A89 Sensore corrente alimentazione 14 Volt\n" +
            "P0A8A Sensore corrente alimentazione 14 Volt\n" +
            "P0A8B Tensione modulo alimentazione 14 Volt\n" +
            "P0A8C Tensione instabile alimentaz.14 Volt\n" +
            "P0A8D Tensione bassa modulo alimentaz.14 Volt\n" +
            "P0A8E Tensione bassa modulo alimentaz.14 Volt\n" +
            "P0A8F Tensione modulo alimentaz.14 Volt\n" +
            "P0A90 Prestazione azionamento motore A\n" +
            "P0A91 Prestazione azionamento motore B\n" +
            "P0A92 Prestazione generatore ibrido\n" +
            "P0A93 Sistema raffreddamento dell'inverter\n" +
            "P0A94 Prestazione convertitore DC/DC\n" +
            "P0A95 Fusibile ad alta tensione\n" +
            "P0A96 Ventola 2 refrig.pacco batteria ibrida\n" +
            "P0A97 Ventola 2 refrig.pacco batteria ibrida\n" +
            "P0A98 Ventola 2 refrig.pacco batteria ibrida\n" +
            "P0A99 Ventola 2 refrig.pacco batteria ibrida\n" +
            "P0A9A Ventola 2 refrig.pacco batteria ibrida\n" +
            "P0A9B Sensore A temperatura batteria ibrida\n" +
            "P0A9C Sensore A temperatura batteria ibrida\n" +
            "P0A9D Sensore A temperatura batteria ibrida\n" +
            "P0A9E Sensore A temperatura batteria ibrida\n" +
            "P0A9F Sensore A temperatura batteria ibrida\n" +
            "P0AA0 Contatto positivo batteria ibrida\n" +
            "P0AA1 Contatto positivo batteria ibrida\n" +
            "P0AA2 Contatto positivo batteria ibrida\n" +
            "P0AA3 Contatto negativo batteria ibrida\n" +
            "P0AA4 Contatto negativo batteria ibrida\n" +
            "P0AA5 Contatto negativo batteria ibrida\n" +
            "P0AA6 Tensione batteria ibrida\n" +
            "P0AA7 Tensione batteria ibrida\n" +
            "P0AA8 Tensione batteria ibrida\n" +
            "P0AA9 Tensione batteria ibrida\n" +
            "P0AAA Tensione batteria ibrida\n" +
            "P0AAB Tensione batteria ibrida\n" +
            "P0AAC Sensore A temp.aria batteria ibrida\n" +
            "P0AAD Sensore A temp.aria batteria ibrida\n" +
            "P0AAE Sensore A temp.aria batteria ibrida\n" +
            "P0AAF Sensore A temp.aria batteria ibrida\n" +
            "P0AB0 Sensore A temp.aria batteria ibrida\n" +
            "P0AB1 Sensore B temp.aria batteria ibrida\n" +
            "P0AB2 Sensore B temp.aria batteria ibrida\n" +
            "P0AB3 Sensore B temp.aria batteria ibrida\n" +
            "P0AB4 Sensore B temp.aria batteria ibrida\n" +
            "P0AB5 Sensore B temp.aria batteria ibrida\n" +
            "P0AB6 Controllo supporto motore\n" +
            "P0AB7 Controllo supporto motore\n" +
            "P0AB9 Prestazione sistema ibrido\n" +
            "P0ABa Controllo tensione pacco batteria ibrida\n" +
            "P0ABB Controllo tensione pacco batteria ibrida\n" +
            "P0ABC Controllo tensione pacco batteria ibrida\n" +
            "P0ABD Controllo tensione pacco batteria ibrida\n" +
            "P0ABE Controllo tensione pacco batteria ibrida\n" +
            "P0ABF Controllo corrente batteria ibrida\n" +
            "P0AC0 Controllo corrente batteria ibrida\n" +
            "P0AC1 Controllo corrente batteria ibrida\n" +
            "P0AC2 Controllo corrente batteria ibrida\n" +
            "P0AC3 Controllo corrente batteria ibrida\n" +
            "P0AC4 Illuminazione MIL powertrain ibrido\n" +
            "P0AC5 Sensore B temperatura batteria inbrida\n" +
            "P0AC6 Sensore B temperatura batteria inbrida\n" +
            "P0AC7 Sensore B temperatura batteria inbrida\n" +
            "P0AC8 Sensore B temperatura batteria inbrida\n" +
            "P0AC9 Sensore B temperatura batteria inbrida\n" +
            "P0ACA Sensore C temperatura batteria inbrida\n" +
            "P0ACB Sensore C temperatura batteria inbrida\n" +
            "P0ACC Sensore C temperatura batteria inbrida\n" +
            "P0ACD Sensore C temperatura batteria inbrida\n" +
            "P0ACE Sensore C temperatura batteria inbrida\n" +
            "P0ACF Ventola 3 refrig.pacco batteria ibrida\n" +
            "P0AD0 Ventola 3 refrig.pacco batteria ibrida\n" +
            "P0AD1 Ventola 3 refrig.pacco batteria ibrida\n" +
            "P0AD2 Ventola 3 refrig.pacco batteria ibrida\n" +
            "P0AD3 Ventola 3 refrig.pacco batteria ibrida";
    static String P0000P04AB = "P0000 Nessun codice riscontrato\n" +
            "P0001 Controllo regolatore volume combust.\n" +
            "P0002 Controllo regolatore combust.\n" +
            "P0003 Controllo regolatore volume combust.\n" +
            "P0004 Controllo regolatore volume combust.\n" +
            "P0005 Circuito valvola taglio carburante\n" +
            "P0006 Controllo interrutt.A valvola carburante\n" +
            "P0007 Controllo interrutt.A valvola carburante\n" +
            "P0008 Prestazione sistema posizione motore\n" +
            "P0009 Prestazione sistema posizione motore\n" +
            "P000A Albero a camme aspirazione A banco 1\n" +
            "P000B Albero a camme scarico B banco 1\n" +
            "P000C Albero a camme aspirazione A banco 2\n" +
            "P000D Albero a camme scarico B banco 2\n" +
            "P0010 Attuatore albero camme A1\n" +
            "P0011 Albero camme A1 troppo in anticipo\n" +
            "P0012 Albero camme A1 troppo in ritardo\n" +
            "P0013 Attuatore albero camme B1\n" +
            "P0014 Albero camme B1 troppo in anticipo\n" +
            "P0015 Albero camme B1 troppo in ritardo\n" +
            "P0016 Posizione Albero a gomito\n" +
            "P0017 Posizione Albero a gomito\n" +
            "P0018 Posizione Albero a gomito\n" +
            "P0019 Posizione Albero a gomito\n" +
            "P0020 Attuatore albero camme A2\n" +
            "P0021 Albero camme A2 troppo in anticipo\n" +
            "P0022 Albero camme A2 troppo in ritardo\n" +
            "P0023 Attuatore albero camme B2\n" +
            "P0024 Albero camme B2 troppo in anticipo\n" +
            "P0025 Albero camme B2 troppo in ritardo\n" +
            "P0026 Solenoide controllo valvola aspirazione\n" +
            "P0027 Solenoide controllo valvola di scarico\n" +
            "P0028 Solenoide controllo valvola aspirazione\n" +
            "P0029 Solenoide controllo valvola di scarico\n" +
            "P0030 Riscaldatore lambda B1 S1\n" +
            "P0031 Risc. lambda cc a - B1 S1\n" +
            "P0032 Risc. lambda cc a + B1 S1\n" +
            "P0033 Valv. Bypass turbo\n" +
            "P0034 Valv. Bypass turbo cc a -\n" +
            "P0035 Valv. Bypass turbo cc a +\n" +
            "P0036 Riscaldatore la mbda B1 S2\n" +
            "P0037 Risc. lambda cc a - B1 S2\n" +
            "P0038 Risc. lambda cc a + B1 S2\n" +
            "P0039 Controllo valvola derivazione turbo\n" +
            "P0040 Segnali sensore ossigeno scambiati\n" +
            "P0041 Segnali sensore ossigeno scambiati\n" +
            "P0042 Riscaldatore lambda B1 S3\n" +
            "P0043 Risc. lambda cc a - B1 S3\n" +
            "P0044 Risc. lambda cc a + B1 S3\n" +
            "P0045 Comando turbo geometria variabile\n" +
            "P0046 Solenoide B controllo turbo-fuori range\n" +
            "P0047 Segnale attuatore turbo sotto soglia\n" +
            "P0048 Segnale attuatore turbo sopra soglia\n" +
            "P0049 Velocità eccessiva turbina\n" +
            "P004A Solenoide B turbo circuito aperto\n" +
            "P004B Solenoide B turbo fuori tolleranza\n" +
            "P004C Solenoide B turbo segnale basso\n" +
            "P004D Solenoide B turbo segnale alto\n" +
            "P004E Solenoide A turbo segnale intermittente\n" +
            "P004F Solenoide B turbo segnale intermittente\n" +
            "P0050 Riscaldatore lambda B2 S1\n" +
            "P0051 Risc. lambda cc a - B2 S1\n" +
            "P0052 Risc. lambda cc a + B2 S1\n" +
            "P0053 Resistenza riscaldatore lambda\n" +
            "P0054 Resistenza riscaldatore lambda\n" +
            "P0055 Resistenza riscaldatore lambda\n" +
            "P0056 Riscaldatore lambda B2 S2\n" +
            "P0057 Risc. lambda cc a - B2 S2\n" +
            "P0058 Risc. lambda cc a + B2 S2\n" +
            "P0059 Resistenza riscaldatore lambda\n" +
            "P0060 Resistenza riscaldatore lambda\n" +
            "P0061 Resistenza riscaldatore lambda\n" +
            "P0062 Riscaldatore lambda B2 S3\n" +
            "P0063 Risc. lambda cc a - B2 S3\n" +
            "P0064 Risc. lambda cc a + B2 S3\n" +
            "P0065 Iniettore aria secondaria\n" +
            "P0066 Iniett. aria secondaria cc a -\n" +
            "P0067 Iniett. aria secondaria cc a +\n" +
            "P0068 Correlazione sensore pressione assoluta nel collettore/sensore massa aria sensore posizione farfalla\n" +
            "P0069 Segnale pressione barometrica\n" +
            "P0070 Sensore temp. aria ambiente\n" +
            "P0071 Sensore temp. aria ambiente\n" +
            "P0072 Sens. temp. aria ambiente cc a -\n" +
            "P0073 Sens. temp. aria ambiente cc a +\n" +
            "P0074 Sens. temp. aria amb. intermitt.\n" +
            "P0075 Valv. collett. aspiraz. B1\n" +
            "P0076 Valv. collett. aspiraz. B1 cc a -\n" +
            "P0077 Valv. collett. aspiraz. B1 cc a +\n" +
            "P0078 Valv. collett. scarico B1\n" +
            "P0079 Valv. collett. scarico B1 cc a -\n" +
            "P0080 Valv. collett. scarico B1 cc a +\n" +
            "P0081 Valv. collett. aspiraz. B2\n" +
            "P0082 Valv. collett. aspiraz. B2 cc a -\n" +
            "P0083 Valv. collett. aspiraz. B2 cc a +\n" +
            "P0084 Valv. collett. scarico B2\n" +
            "P0085 Valv. collett. scarico B2 cc a -\n" +
            "P0086 Valv. collett. scarico B2 cc a +\n" +
            "P0087 Pressione common rail troppo bassa\n" +
            "P0088 Pressione common rail troppo alta\n" +
            "P0089 Regolatore pressione carburante\n" +
            "P0090 Circuito regolazione press.carbur.\n" +
            "P0091 Valvola regolaz. pressione rail cc gnd\n" +
            "P0092 Valvola regolaz. pressione rail cc +Vbat\n" +
            "P0093 Perdita carburante alta pressione\n" +
            "P0094 Perdita carburante bassa pressione\n" +
            "P0095 Sensore 2 temperatura aria aspirata\n" +
            "P0096 Sensore 2 temperatura aria aspirata\n" +
            "P0097 Sensore 2 temperatura aria aspirata\n" +
            "P0098 Sensore 2 temperatura aria aspirata\n" +
            "P0099 Sensore 2 temperatura aria aspirata\n" +
            "P0100 Misuratore flusso aria\n" +
            "P0101 Misuratore flusso aria s.errato\n" +
            "P0102 Misuratore flusso aria cc a -\n" +
            "P0103 Misuratore flusso aria cc a +\n" +
            "P0104 Misuratore flusso aria intermitt.\n" +
            "P0105 Press. coll. aspirazione\n" +
            "P0106 Press. coll. aspir. s.errato\n" +
            "P0107 Press. coll. aspir. cc a -\n" +
            "P0108 Press. coll. aspir. cc a +\n" +
            "P0109 Press. coll. aspir. s.intermitt.\n" +
            "P010A Flussometro circuito B\n" +
            "P010B Flussometro circuito B Fuori Range\n" +
            "P010C Flussometro circuito B - Input Basso\n" +
            "P010D Flussometro circuito B - Input Alto\n" +
            "P010E Flussometro circuito B intermittente\n" +
            "P010F Flussometro - Correlazione sensori A/B\n" +
            "P0110 Sensore temp.aria aspirata\n" +
            "P0111 Temp. aria aspirata s.errato\n" +
            "P0112 Temp. aria aspirata cc a -\n" +
            "P0113 Temp. aria aspirata cc a +\n" +
            "P0114 Temp. aria aspirata s.intermitt.\n" +
            "P0115 Sens. temp. motore\n" +
            "P0116 Temp. motore s.errato\n" +
            "P0117 Temp. motore cc a -\n" +
            "P0118 Temp. motore cc a +\n" +
            "P0119 Temp. motore s.intermitt.\n" +
            "P011A Correlazione sensori 1/2 temp. Motore\n" +
            "P0120 Posiz. farfalla/pedale A\n" +
            "P0121 Posiz. farfalla/pedale A s.errato\n" +
            "P0122 Posiz. farfalla/pedale A cc a -\n" +
            "P0123 Posiz. farfalla/pedale A cc a +\n" +
            "P0124 Pos. farfalla/pedale A intermitt.\n" +
            "P0125 Temp. motore troppo bassa\n" +
            "P0126 Temp. motore troppo bassa\n" +
            "P0127 Temp. aria aspir. troppo alta\n" +
            "P0128 Termostato motore\n" +
            "P0129 Pressione barometrica troppo bassa\n" +
            "P0130 S.Lambda B1 S1\n" +
            "P0131 S.Lambda B1 S1 V bassa\n" +
            "P0132 S.Lambda B1 S1 V alta\n" +
            "P0133 S.Lambda B1 S1 risp.lenta\n" +
            "P0134 S.Lambda B1 S1 manca attività\n" +
            "P0135 Risc.S.Lambda B1 S1\n" +
            "P0136 S.Lambda B1 S2\n" +
            "P0137 S.Lambda B1 S2 V bassa\n" +
            "P0138 S.Lambda B1 S2 V alta\n" +
            "P0139 S.Lambda B1 S2 risp.lenta\n" +
            "P0140 S.Lambda B1 S2 manca attività\n" +
            "P0141 Risc.S.Lambda B1 S2\n" +
            "P0142 S.Lambda B1 S3\n" +
            "P0143 S.Lambda B1 S3 V bassa\n" +
            "P0144 S.Lambda B1 S3 V alta\n" +
            "P0145 S.Lambda B1 S3 risp.lenta\n" +
            "P0146 S.Lambda B1 S3 manca attività\n" +
            "P0147 Risc.S.Lambda B1 S3\n" +
            "P0148 Erogazione carburante\n" +
            "P0149 Fasatura carburante\n" +
            "P0150 S.Lambda B2 S1\n" +
            "P0151 S.Lambda B2 S1 V bassa\n" +
            "P0152 S.Lambda B2 S1 V alta\n" +
            "P0153 S.Lambda B2 S1 risp.lenta\n" +
            "P0154 S.Lambda B2 S1 manca attività\n" +
            "P0155 Risc.S.Lambda B2 S1\n" +
            "P0156 S.Lambda B2 S2\n" +
            "P0157 S.Lambda B2 S2 V bassa\n" +
            "P0158 S.Lambda B2 S2 V alta\n" +
            "P0159 S.Lambda B2 S2 risp.lenta\n" +
            "P0160 S.Lambda B2 S2 manca attività\n" +
            "P0161 Risc.S.Lambda B2 S2\n" +
            "P0162 S.Lambda B2 S3\n" +
            "P0163 S.Lambda B2 S3 V bassa\n" +
            "P0164 S.Lambda B2 S3 V alta\n" +
            "P0165 S.Lambda B2 S3 risp.lenta\n" +
            "P0166 S.Lambda B2 S3 manca attività\n" +
            "P0167 Risc.S.Lambda B2 S3\n" +
            "P0168 Temp.carburante troppo alta\n" +
            "P0169 Compos.carburante sbagliata\n" +
            "P0170 Regolaz.miscela B1\n" +
            "P0171 Miscela troppo magra B1\n" +
            "P0172 Miscela troppo ricca B1\n" +
            "P0173 Regolaz.miscela B2\n" +
            "P0174 Miscela troppo magra B2\n" +
            "P0175 Miscela troppo ricca B2\n" +
            "P0176 Sens.composiz.carburante\n" +
            "P0177 Sens.compos.carburante s.errato\n" +
            "P0178 Sens.composiz.carburante cc a -\n" +
            "P0179 Sens.composiz.carburante cc a +\n" +
            "P0180 Sens. A temp. carburante\n" +
            "P0181 Sens. A temp.carb. s.errato\n" +
            "P0182 Sens. A temp.carb. cc a -\n" +
            "P0183 Sens. A temp.carb. cc a +\n" +
            "P0184 Sens. A temp.carb. Intermitt.\n" +
            "P0185 Sens. B temp. carburante\n" +
            "P0186 Sens. B temp.carb. s.errato\n" +
            "P0187 Sens. B temp.carb. cc a -\n" +
            "P0188 Sens. B temp.carb. cc a +\n" +
            "P0189 Sens. B temp.carb. Intermitt.\n" +
            "P018A Sensore pressione carburante circ. B\n" +
            "P018B Sensore B Pressione carburante\n" +
            "P018C Sensore B Pressione carburante\n" +
            "P018D Sensore B Pressione carburante\n" +
            "P018E Sensore B Pressione carburante\n" +
            "P0190 Sensore pressione flauto/rail carburante\n" +
            "P0191 Sens. press. carbur. s.errato\n" +
            "P0192 Sens. press. carbur. cc a -\n" +
            "P0193 Sens. press. carbur. cc a +\n" +
            "P0194 Sens. press. carbur. intermitt.\n" +
            "P0195 Sens. temp. olio motore\n" +
            "P0196 Temp. olio motore s.errato\n" +
            "P0197 Temp. olio motore cc a -\n" +
            "P0198 Temp. olio motore cc a +\n" +
            "P0199 Temp. olio motore intermitt.\n" +
            "P0200 Circuito iniettore\n" +
            "P0201 Iniettore cilindro 1\n" +
            "P0202 Iniettore cilindro 2\n" +
            "P0203 Iniettore cilindro 3\n" +
            "P0204 Iniettore cilindro 4\n" +
            "P0205 Iniettore cilindro 5\n" +
            "P0206 Iniettore cilindro 6\n" +
            "P0207 Iniettore cilindro 7\n" +
            "P0208 Iniettore cilindro 8\n" +
            "P0209 Iniettore cilindro 9\n" +
            "P020A Cilindro 1 Sincronizzazione iniezione\n" +
            "P020B Cilindro 2 Sincronizzazione iniezione\n" +
            "P020C Cilindro 3 Sincronizzazione iniezione\n" +
            "P020D Cilindro 4 Sincronizzazione iniezione\n" +
            "P020E Cilindro 5 Sincronizzazione iniezione\n" +
            "P020F Cilindro 6 Sincronizzazione iniezione\n" +
            "P0210 Iniettore cilindro 10\n" +
            "P0211 Iniettore cilindro 11\n" +
            "P0212 Iniettore cilindro 12\n" +
            "P0213 Iniett. 1 avviam. a freddo\n" +
            "P0214 Iniett. 2 avviam. a freddo\n" +
            "P0215 Solen. spegnimento motore\n" +
            "P0216 Fasatura iniezione\n" +
            "P0217 Sovratemperatura acqua\n" +
            "P0218 Sovratemperatura olio cambio\n" +
            "P0219 Fuorigiri motore\n" +
            "P021A Cilindro 7 Sincronizzazione iniezione\n" +
            "P021B Cilindro 8 Sincronizzazione iniezione\n" +
            "P021C Cilindro 9 Sincronizzazione iniezione\n" +
            "P021D Cilindro 10 Sincronizzazione iniezione\n" +
            "P021E Cilindro 11 Sincronizzazione iniezione\n" +
            "P021F Cilindro 12 Sincronizzazione iniezione\n" +
            "P0220 Posiz. farfalla/pedale B\n" +
            "P0221 Posiz. farfalla/pedale B s.errato\n" +
            "P0222 Posiz. farfalla/pedale B cc a -\n" +
            "P0223 Posiz. farfalla/pedale B cc a +\n" +
            "P0224 Pos. farfalla/pedale B intermitt.\n" +
            "P0225 Posiz. farfalla/pedale C\n" +
            "P0226 Posiz. farfalla/pedale C s.errato\n" +
            "P0227 Posiz. farfalla/pedale C cc a -\n" +
            "P0228 Posiz. farfalla/pedale C cc a +\n" +
            "P0229 Pos. farfalla/pedale C intermitt.\n" +
            "P022A Bypass Intercooler A - Circuito Aperto\n" +
            "P022B Bypass Intercooler A - Segnale Basso\n" +
            "P022C Bypass Intercooler A - Segnale Alto\n" +
            "P022D Bypass Intercooler B - Circuito Aperto\n" +
            "P022E Bypass Intercooler B - Segnale Basso\n" +
            "P022F Bypass Intercooler B - Segnale Alto\n" +
            "P0230 Primario pompa carburante\n" +
            "P0231 Second. pompa carbur. cc a -\n" +
            "P0232 Second. pompa carbur. cc a +\n" +
            "P0233 Second. pompa carbur. intermitt.\n" +
            "P0234 Sovralimentaz. Eccessiva\n" +
            "P0235 Sensore sovralim. A\n" +
            "P0236 Sensore sovralim. A s.errato\n" +
            "P0237 Sensore sovralim. A cc a -\n" +
            "P0238 Sensore sovralim. A cc a +\n" +
            "P0239 Sensore sovralim. B\n" +
            "P023A Pompa refrig.Intercooler - Circ.Aperto\n" +
            "P023B Pompa refrig.Intercooler - Segnale Basso\n" +
            "P023C Pompa refrig.Intercooler - Segnale Alto\n" +
            "P023D Correlazione press.Collettore/Turbo\n" +
            "P023E Correlazione press.Collettore/Turbo\n" +
            "P0240 Sensore sovralim. B s.errato\n" +
            "P0241 Sensore sovralim. B cc a -\n" +
            "P0242 Sensore sovralim. B cc a +\n" +
            "P0243 Wastegate A\n" +
            "P0244 Wastegate A s.errato\n" +
            "P0245 Wastegate A cc a -\n" +
            "P0246 Wastegate A cc a +\n" +
            "P0247 Wastegate B\n" +
            "P0248 Wastegate B s.errato\n" +
            "P0249 Wastegate B cc a -\n" +
            "P0250 Wastegate B cc a +\n" +
            "P0251 Pompa iniezione A\n" +
            "P0252 Pompa iniezione A s.errato\n" +
            "P0253 Pompa iniezione A cc a -\n" +
            "P0254 Pompa iniezione A cc a +\n" +
            "P0255 Pompa iniezione A intermitt.\n" +
            "P0256 Pompa iniezione B\n" +
            "P0257 Pompa iniezione B s.errato\n" +
            "P0258 Pompa iniezione B cc a -\n" +
            "P0259 Pompa iniezione B cc a +\n" +
            "P0260 Pompa iniezione B intermitt.\n" +
            "P0261 Iniettore cilindro 1 cc a -\n" +
            "P0262 Iniettore cilindro 1 cc a +\n" +
            "P0263 Iniettore cilindro 1 q.carburante\n" +
            "P0264 Iniettore cilindro 2 cc a -\n" +
            "P0265 Iniettore cilindro 2 cc a +\n" +
            "P0266 Iniettore cilindro 2 q.carburante\n" +
            "P0267 Iniettore cilindro 3 cc a -\n" +
            "P0268 Iniettore cilindro 3 cc a +\n" +
            "P0269 Iniettore cilindro 3 q.carburante\n" +
            "P0270 Iniettore cilindro 4 cc a -\n" +
            "P0271 Iniettore cilindro 4 cc a +\n" +
            "P0272 Iniettore cilindro 4 q.carburante\n" +
            "P0273 Iniettore cilindro 5 cc a -\n" +
            "P0274 Iniettore cilindro 5 cc a +\n" +
            "P0275 Iniettore cilindro 5 q.carburante\n" +
            "P0276 Iniettore cilindro 6 cc a -\n" +
            "P0277 Iniettore cilindro 6 cc a +\n" +
            "P0278 Iniettore cilindro 6 q.carburante\n" +
            "P0279 Iniettore cilindro 7 cc a -\n" +
            "P0280 Iniettore cilindro 7 cc a +\n" +
            "P0281 Iniettore cilindro 7 q.carburante\n" +
            "P0282 Iniettore cilindro 8 cc a -\n" +
            "P0283 Iniettore cilindro 8 cc a +\n" +
            "P0284 Iniettore cilindro 8 q.carburante\n" +
            "P0285 Iniettore cilindro 9 cc a -\n" +
            "P0286 Iniettore cilindro 9 cc a +\n" +
            "P0287 Iniettore cilindro 9 q.carburante\n" +
            "P0288 Iniettore cilindro 10 cc a -\n" +
            "P0289 Iniettore cilindro 10 cc a +\n" +
            "P0290 Iniettore cilindro 10 q.carburante\n" +
            "P0291 Iniettore cilindro 11 cc a -\n" +
            "P0292 Iniettore cilindro 11 cc a +\n" +
            "P0293 Iniettore cilindro 11 q.carburante\n" +
            "P0294 Iniettore cilindro 12 cc a -\n" +
            "P0295 Iniettore cilindro 12 cc a +\n" +
            "P0296 Iniettore cilindro 12 q.carburante\n" +
            "P0297 Condizione eccessiva velocità veicolo\n" +
            "P0298 Sovratemperatura olio motore\n" +
            "P0299 Pressione di sovralimentazione bassa\n" +
            "P0300 Mancate accens. multiple/casuali\n" +
            "P0301 Mancate accens. cilindro 1\n" +
            "P0302 Mancate accens. cilindro 2\n" +
            "P0303 Mancate accens. cilindro 3\n" +
            "P0304 Mancate accens. cilindro 4\n" +
            "P0305 Mancate accens. cilindro 5\n" +
            "P0306 Mancate accens. cilindro 6\n" +
            "P0307 Mancate accens. cilindro 7\n" +
            "P0308 Mancate accens. cilindro 8\n" +
            "P0309 Mancate accens. cilindro 9\n" +
            "P0310 Mancate accens. cilindro 10\n" +
            "P0311 Mancate accens. cilindro 11\n" +
            "P0312 Mancate accens. cilindro 12\n" +
            "P0313 Misfire con liv. carbur. basso\n" +
            "P0314 Mancate accens.\n" +
            "P0315 Variazione Posizione albero a gomito\n" +
            "P0316 Misfire rilevato all`avviamento\n" +
            "P0317 Hardware strada dissestata non presente\n" +
            "P0318 Segnale sensore A strada dissestata\n" +
            "P0319 Segnale sensore B strada dissestata\n" +
            "P0320 Ingr. giri accens/distrib.\n" +
            "P0321 Ingr. giri distrib. s.errato\n" +
            "P0322 Ingr. giri distrib. senza segnale\n" +
            "P0323 Ingr. giri distrib. Intermittente\n" +
            "P0324 Sist. controllo battito\n" +
            "P0325 Sensore battito B1\n" +
            "P0326 Sensore battito B1 s.errato\n" +
            "P0327 Sensore battito B1 cc a -\n" +
            "P0328 Sensore battito B1 cc a +\n" +
            "P0329 Sensore battito B1 intermitt.\n" +
            "P0330 Sensore battito B2\n" +
            "P0331 Sensore battito B2 s.errato\n" +
            "P0332 Sensore battito B2 cc a -\n" +
            "P0333 Sensore battito B2 cc a +\n" +
            "P0334 Sensore battito B2 intermitt.\n" +
            "P0335 Sens. A pos. albero motore\n" +
            "P0336 Sens. A pos. albero mot. s.errato\n" +
            "P0337 Sens. A pos. albero mot. cc a -\n" +
            "P0338 Sens. A pos. albero mot. cc a +\n" +
            "P0339 Sens. A pos. albero mot.intermitt.\n" +
            "P0340 Sens. A B1 albero cam.\n" +
            "P0341 Sens. A B1 albero cam. s.errato\n" +
            "P0342 Sens. A B1 albero cam. cc a -\n" +
            "P0343 Sens. A B1 albero cam. cc a +\n" +
            "P0344 Sens. A B1 albero cam. intermitt.\n" +
            "P0345 Sens. A B2 albero cam.\n" +
            "P0346 Sens. A B2 albero cam. s.errato\n" +
            "P0347 Sens. A B2 albero cam. cc a -\n" +
            "P0348 Sens. A B2 albero cam. cc a +\n" +
            "P0349 Sens. A B2 albero cam. Intermitt.\n" +
            "P0350 Prim. o second. bobina\n" +
            "P0351 Prim. o second. bobina A\n" +
            "P0352 Prim. o second. bobina B\n" +
            "P0353 Prim. o second. bobina C\n" +
            "P0354 Prim. o second. bobina D\n" +
            "P0355 Prim. o second. bobina E\n" +
            "P0356 Prim. o second. bobina F\n" +
            "P0357 Prim. o second. bobina G\n" +
            "P0358 Prim. o second. bobina H\n" +
            "P0359 Prim. o second. bobina I\n" +
            "P0360 Prim. o second. bobina J\n" +
            "P0361 Prim. o second. bobina K\n" +
            "P0362 Prim. o second. bobina L\n" +
            "P0363 Rilevato misfire - rifornimento disab.\n" +
            "P0364 Sensore B posizione albero a camme\n" +
            "P0365 Sens. B B2 albero cam.\n" +
            "P0366 Sens. B B2 albero cam. s.errato\n" +
            "P0367 Sens. B B2 albero cam. cc a -\n" +
            "P0368 Sens. B B2 albero cam. cc a +\n" +
            "P0369 Sens. B B2 albero cam. Intermitt.\n" +
            "P0370 Rif. di fasatura A\n" +
            "P0371 Rif. di fasatura A troppi impulsi\n" +
            "P0372 Rif. di fasatura A pochi impulsi\n" +
            "P0373 Rif. di fasatura A intermittente\n" +
            "P0374 Rif. di fasatura A senza segnale\n" +
            "P0375 Rif. di fasatura B\n" +
            "P0376 Rif. di fasatura B troppi impulsi\n" +
            "P0377 Rif. di fasatura B pochi impulsi\n" +
            "P0378 Rif. di fasatura B intermittente\n" +
            "P0379 Rif. di fasatura B senza segnale\n" +
            "P0380 Candelette preriscald. A\n" +
            "P0381 Spia candelette preriscald.\n" +
            "P0382 Candelette preriscald. B\n" +
            "P0383 Modulo controllo accensione candela\n" +
            "P0384 Modulo controllo accensione candela\n" +
            "P0385 Sens. B pos. albero motore\n" +
            "P0386 Sens. B pos. albero mot. s.errato\n" +
            "P0387 Sens. B pos. albero mot. cc a -\n" +
            "P0388 Sens. B pos. albero mot. cc a +\n" +
            "P0389 Sens. B pos. albero mot.intermitt.\n" +
            "P0390 Sens. B B2 albero cam.\n" +
            "P0391 Sens. B B2 albero cam. s.errato\n" +
            "P0392 Sens. B B2 albero cam. cc a -\n" +
            "P0393 Sens. B B2 albero cam. cc a +\n" +
            "P0394 Sens. B B2 albero cam. intermitt.\n" +
            "P0395 Posizione sensore B albero a camme.Valori in imput alti( bancata 2)\n" +
            "P0396 Valori in imput alti( bancata 2) Circuito intermittente ( bancata 2)\n" +
            "P0397 Errore generico\n" +
            "P0398 Errore generico\n" +
            "P0399 Errore generico\n" +
            "P0400 Flusso EGR anomalo\n" +
            "P0401 Flusso EGR insufficiente\n" +
            "P0402 Flusso EGR eccessivo\n" +
            "P0403 Comando EGR\n" +
            "P0404 Comando EGR s.errato\n" +
            "P0405 EGR Sensore A cc a -\n" +
            "P0406 EGR Sensore A cc a +\n" +
            "P0407 EGR Sensore B cc a -\n" +
            "P0408 EGR Sensore B cc a +\n" +
            "P0409 EGR Sensore A\n" +
            "P040A Sensore A temperatura EGR\n" +
            "P040B Sensore A Temperatura EGR Fuori Range\n" +
            "P040C Sensore A Temperatura EGR Segnale Basso\n" +
            "P040D Sensore A Temperatura EGR Segnale Alto\n" +
            "P040E Sensore A Temp.EGR Segnale Intermittente\n" +
            "P040F Correlazione Sens.A/B Temperatura EGR\n" +
            "P0410 Iniezione aria secondaria\n" +
            "P0411 Iniez. aria sec. flusso errato\n" +
            "P0412 Valv. A iniez. aria sec. anomalia\n" +
            "P0413 Valv. A iniez. aria sec. ca\n" +
            "P0414 Valv. A iniez. aria sec. cc\n" +
            "P0415 Valv. B iniez. aria sec. anomalia\n" +
            "P0416 Valv. B iniez. aria sec. ca\n" +
            "P0417 Valv. B iniez. aria sec. cc\n" +
            "P0418 Relè A iniez. aria secondaria\n" +
            "P0419 Relè B iniez. aria secondaria\n" +
            "P041A Sensore B Temperatura EGR\n" +
            "P041B Sensore B Temperatura EGR Fuori Range\n" +
            "P041C Sensore B Temperatura EGR Segnale Basso\n" +
            "P041D Sensore B Temperatura EGR Segnale Alto\n" +
            "P041E Sensore B Temp.EGR Segnale Intermittente\n" +
            "P0420 Bassa effic. sistema cat. B1\n" +
            "P0421 Bassa effic. riscaldatore cat. B1\n" +
            "P0422 Bassa effic. cat. principale B1\n" +
            "P0423 Bassa effic. cat. riscaldato B1\n" +
            "P0424 Bassa temp. cat. riscaldato B1\n" +
            "P0425 Sens. temp. catalizz. B1\n" +
            "P0426 Sens. temp. catalizz. B1 s.errato\n" +
            "P0427 Sens. temp. catalizz. B1 cc a -\n" +
            "P0428 Sens. temp. catalizz. B1 cc a +\n" +
            "P0429 Circ. riscald. catalizz. B1\n" +
            "P042A Sensore Temperatura Catalizzatore(B1S2)\n" +
            "P042C Sensore temperatura catalizzatore\n" +
            "P042D Sensore temperatura catalizzatore\n" +
            "P0430 Bassa effic. sistema cat. B2\n" +
            "P0431 Bassa effic. riscaldatore cat. B2\n" +
            "P0432 Bassa effic. cat. principale B2\n" +
            "P0433 Bassa effic. cat. riscaldato B2\n" +
            "P0434 Bassa temp. cat. riscaldato B2\n" +
            "P0435 Sens. temp. catalizz. B2\n" +
            "P0436 Sens. temp. catalizz. B2 s.errato\n" +
            "P0437 Sens. temp. catalizz. B2 cc a -\n" +
            "P0438 Sens. temp. catalizz. B2 cc a +\n" +
            "P0439 Circ. riscald. catalizz. B2\n" +
            "P043A Sensore Temperatura Catalizzatore(B2S2)\n" +
            "P043B Sensore temperatura catalizzatore\n" +
            "P043C Sensore temperatura catalizzatore\n" +
            "P043D Sensore temperatura catalizzatore\n" +
            "P043E Foro Sistema antievaporativo\n" +
            "P043F Foro Sistema antievaporativo\n" +
            "P0440 Sist. antievaporativo\n" +
            "P0441 Sist. antievap. flusso errato\n" +
            "P0442 Piccola perdita sist. antievap.\n" +
            "P0443 Circuito canister\n" +
            "P0444 Canister ca\n" +
            "P0445 Canister cc\n" +
            "P0446 Sfiato sist. antievap.\n" +
            "P0447 Sfiato sist. antievap. ca\n" +
            "P0448 Sfiato sist. antievap. cc\n" +
            "P0449 Valv. sfiato sist. antievap.\n" +
            "P0450 Sens. press. sist. antievap.\n" +
            "P0451 Sens. P. sist. antievap. s.errato\n" +
            "P0452 Sens. P. sist. antievap. cc a -\n" +
            "P0453 Sens. P. sist. antievap. cc a +\n" +
            "P0454 Sens. P. sist. antievap. interm.\n" +
            "P0455 Grossa perdita sist. antievap.\n" +
            "P0456 Perdita m.piccola sist. antievap.\n" +
            "P0457 Tappo serbatoio assente\n" +
            "P0458 Valvola controllo svuotamento EEC\n" +
            "P0459 Valvola controllo svuotamento EEC\n" +
            "P0460 Sens. livello carbur.\n" +
            "P0461 Sens. livello carbur. s.errato\n" +
            "P0462 Sens. livello carbur. cc a -\n" +
            "P0463 Sens. livello carbur. cc a +\n" +
            "P0464 Sens. livello carbur. intermitt.\n" +
            "P0465 Sens. rigenerazione\n" +
            "P0466 Sens. rigenerazione s.errato\n" +
            "P0467 Sens. rigenerazione cc a -\n" +
            "P0468 Sens. rigenerazione cc a +\n" +
            "P0469 Sens. rigenerazione intermitt.\n" +
            "P0470 Sens. P. gas scarico\n" +
            "P0471 Sens. P. gas scarico s.errato\n" +
            "P0472 Sens. P. gas scarico cc a -\n" +
            "P0473 Sens. P. gas scarico cc a +\n" +
            "P0474 Sens. P. gas scarico intermitt.\n" +
            "P0475 Valv. Press. gas scarico\n" +
            "P0476 Valv. Press. gas scarico s.errato\n" +
            "P0477 Valv. Press. gas scarico cc a -\n" +
            "P0478 Valv. Press. gas scarico cc a +\n" +
            "P0479 Valv. Press. gas scarico intermit.\n" +
            "P047A Valvola B Pressione Gas Scarico\n" +
            "P047B Valvola B Pressione Gas Scarico\n" +
            "P047C Valvola B Pressione Gas Scarico\n" +
            "P047D Valvola B Pressione Gas Scarico\n" +
            "P047E Valvola B Pressione Gas Scarico\n" +
            "P0480 Ventola raffreddamento 1\n" +
            "P0481 Ventola raffreddamento 2\n" +
            "P0482 Ventola raffreddamento 3\n" +
            "P0483 Controllo ventola raffredd.\n" +
            "P0484 Corrente eccessiva ventola\n" +
            "P0485 Alimentaz. o massa ventola\n" +
            "P0486 EGR Sensore B\n" +
            "P0487 Comando farfalla EGR\n" +
            "P0488 Comando farfalla EGR s.errato\n" +
            "P0489 Controllo ricircolo gas di scarico\n" +
            "P0490 Controllo ricircolo gas di scarico\n" +
            "P0491 Iniez. aria secondaria B1\n" +
            "P0492 Iniez. aria secondaria B2\n" +
            "P0493 Velocità eccessiva ventola\n" +
            "P0494 Velocità bassa ventola\n" +
            "P0495 Velocità alta ventola\n" +
            "P0496 Alto flusso svuotamento EES\n" +
            "P0497 Basso flusso svuotamento EES\n" +
            "P0498 Controllo sfiato EES - segnale basso\n" +
            "P0499 Controllo sfiato EES - segnale alto\n" +
            "P04AB Sensore temperatura catalizzatore";
    static String P0500P0999 = "P0500 Sens. velocità veicolo\n" +
            "P0501 Sens. velocità veicolo s.errato\n" +
            "P0502 Sens. velocità veicolo cc a -\n" +
            "P0503 Sens. velocità veicolo intermitt.\n" +
            "P0504 Correlazione A/B interruttore freno\n" +
            "P0505 Attuatore minimo\n" +
            "P0506 Att. minimo: motore lento\n" +
            "P0507 Att. minimo: motore veloce\n" +
            "P0508 Att. minimo: cc a -\n" +
            "P0509 Att. minimo: cc a -\n" +
            "P050A Controllo Aria minimo Avviamento freddo\n" +
            "P050B Anticipo Accensione Avviamento a Freddo\n" +
            "P050C Temperatura Motore Avviamento a Freddo\n" +
            "P050D Minimo instabile Avviamento a Freddo\n" +
            "P0510 Interruttore minimo\n" +
            "P0511 Circuito controllo aria minimo\n" +
            "P0512 Motorino avviamento\n" +
            "P0513 Immobilizzatore chiave errata\n" +
            "P0514 Sensore temperatura batteria\n" +
            "P0515 Sens.temp.batt./Sens.temp.aria\n" +
            "P0516 Sens.temp.batt./Sens.temp.aria cc-\n" +
            "P0517 Sens.temp.batt./Sens.temp.aria cc+\n" +
            "P0518 Circuito controllo aria minimo\n" +
            "P0519 Prestazioni controllo aria minimo\n" +
            "P0520 Sens. press. olio\n" +
            "P0521 Sens. press. olio s.errato\n" +
            "P0522 Sens. press. olio cc a -\n" +
            "P0523 Sens. press. olio cc a +\n" +
            "P0524 Press. olio motore troppo bassa\n" +
            "P0525 Cruise control, servo controllo\n" +
            "P0526 Sensore velocità ventola\n" +
            "P0527 Sensore velocità ventola - fuori range\n" +
            "P0528 Sensore velocità ventola - No segnale\n" +
            "P0529 Sensore velocità ventola\n" +
            "P0530 Sens. press. refr. AC\n" +
            "P0531 Sens. press. refr. AC s.errato\n" +
            "P0532 Sens. press. refr. AC cc a -\n" +
            "P0533 Sens. press. refr. AC cc a +\n" +
            "P0534 Perdita refrigerante AC\n" +
            "P0535 Sensore temperatura evaporatore A/C\n" +
            "P0536 Sensore temperatura evaporatore A/C\n" +
            "P0537 Sensore temperatura evaporatore A/C\n" +
            "P0538 Sensore temperatura evaporatore A/C\n" +
            "P0539 Sensore temperatura evaporatore A/C\n" +
            "P0540 Circ. riscald aria aspirata\n" +
            "P0541 Circ.riscald. aria aspirata cc a -\n" +
            "P0542 Circ.riscald. aria aspirata cc a +\n" +
            "P0543 Circuito riscaldatore A aria aspirata\n" +
            "P0544 Sens. T. gas scarico B1\n" +
            "P0545 Sens. T. gas scarico B1 cc a -\n" +
            "P0546 Sens. T. gas scarico B1 cc a +\n" +
            "P0547 Sens. T. gas scarico B2\n" +
            "P0548 Sens. T. gas scarico B2 cc a -\n" +
            "P0549 Sens. T. gas scarico B2 cc a +\n" +
            "P0550 Attuat. servosterzo\n" +
            "P0551 Attuat. servosterzo s.errato\n" +
            "P0552 Attuat. servosterzo cc a -\n" +
            "P0553 Attuat. servosterzo cc a +\n" +
            "P0554 Attuat. servosterzo intermitt.\n" +
            "P0555 Sensore pressione servofreno\n" +
            "P0556 Sensore di pressione freno\n" +
            "P0557 Sensore di pressione freno\n" +
            "P0558 Sensore di pressione freno\n" +
            "P0559 Sensore di pressione freno\n" +
            "P0560 Tensione sistema\n" +
            "P0561 Tensione sistema instabile\n" +
            "P0562 Tensione sistema bassa\n" +
            "P0563 Tensione sistema alta\n" +
            "P0564 Ingresso cruise control\n" +
            "P0565 S.Attivazione cruise control\n" +
            "P0566 S.Disattivazione cruise control\n" +
            "P0567 S.Ripristino cruise control\n" +
            "P0568 S.Impostazione cruise control\n" +
            "P0569 S.Inerzia cruise control\n" +
            "P0570 S.Accelerazione cruise control\n" +
            "P0571 Interrutt. freno A cruise control\n" +
            "P0572 Interrutt. freno A C.C. cc a -\n" +
            "P0573 Interrutt. freno A C.C. cc a +\n" +
            "P0574 Cruise control eccessiva velocità\n" +
            "P0575 Ingresso cruise control\n" +
            "P0576 Ingresso cruise control cc a -\n" +
            "P0577 Ingresso cruise control cc a +\n" +
            "P0578 Cruise control\n" +
            "P0579 Cruise control\n" +
            "P0580 Cruise control\n" +
            "P0581 Input A multi-funzione Cruise control\n" +
            "P0582 Cruise control, Vacuum control\n" +
            "P0583 Cruise control, Vacuum control\n" +
            "P0584 Cruise control, Vacuum control\n" +
            "P0585 Correlazione input A/B Cruise control\n" +
            "P0586 Controllo sfiato Cruise control\n" +
            "P0587 Controllo sfiato Cruise control\n" +
            "P0588 Controllo sfiato Cruise control\n" +
            "P0589 Input B multi-funzione Cruise control\n" +
            "P0590 Input B multi-funzione Cruise control\n" +
            "P0591 Input B multi-funzione Cruise control\n" +
            "P0592 Input B multi-funzione Cruise control\n" +
            "P0593 Input B multi-funzione Cruise control\n" +
            "P0594 Cruise control, servo controllo\n" +
            "P0595 Cruise control, servo controllo\n" +
            "P0596 Cruise control, servo controllo\n" +
            "P0597 Controllo riscaldatore termostato\n" +
            "P0598 Controllo riscaldatore termostato\n" +
            "P0599 Controllo riscaldatore termostato\n" +
            "P0600 Linea comunicazione seriale o CAN bus\n" +
            "P0601 Errore memoria centralina\n" +
            "P0602 Errore programmaz. centralina\n" +
            "P0603 Errore memoria KAM/EEPROM\n" +
            "P0604 Errore memoria RAM centralina\n" +
            "P0605 Errore memoria ROM centralina\n" +
            "P0606 Processore centralina\n" +
            "P0607 Prestazioni centralina\n" +
            "P0608 Uscita VSS A centralina\n" +
            "P0609 Uscita VSS A centralina\n" +
            "P060A Modulo di Controllo Interno Processore\n" +
            "P060B Modulo di Controllo interno A/D\n" +
            "P060C Modulo Controllo Processore Principale\n" +
            "P060D Modulo Controllo Pedale Acceleratore\n" +
            "P060E Modulo Controllo Valvola Farfalla\n" +
            "P060F Controllo Temperatura Refriger.Motore\n" +
            "P0610 Errore opzioni centralina\n" +
            "P0611 Processore controllo iniettori\n" +
            "P0612 Relè controllo iniettore carburante\n" +
            "P0613 Processore TCM\n" +
            "P0614 Incompatibilità ECM/TCM\n" +
            "P0615 Relè motorino avviam.\n" +
            "P0616 Relè motorino avviam. cc a -\n" +
            "P0617 Relè motorino avviam. cc a +\n" +
            "P0618 Errore memoria KAM centr. riserva\n" +
            "P0619 Errore memoria centr. riserva\n" +
            "P061A Modulo Controllo Interno Coppia\n" +
            "P061B Controllo interno calcolo coppia\n" +
            "P061C Modulo controllo interno RPM motore\n" +
            "P061D Controllo interno volume aria aspirata\n" +
            "P061E Modulo controllo interno segnale freno\n" +
            "P061F Controllo attuatore valvola a farfalla\n" +
            "P0620 Circuito controllo alternatore\n" +
            "P0621 Spia L alternatore\n" +
            "P0622 Campo F alternatore\n" +
            "P0623 Spia alternatore\n" +
            "P0624 Spia tappo carburante\n" +
            "P0625\n" +
            "Terminale di campo dell'alternatore-circuito\n" +
            "basso\n" +
            "P0626 Terminale zona generatore - segnale alto\n" +
            "P0627 Controllo pompa A carburante\n" +
            "P0628 Controllo pompa A carburante\n" +
            "P0629 Controllo pompa A carburante\n" +
            "P062A Controllo Pompa Benzina Fuori Range\n" +
            "P062B Controllo interno Iniettore Benzina\n" +
            "P062C Controllo Interno Velocità Veicolo\n" +
            "P062D Driver iniezione benzina banco 1\n" +
            "P062E Driver iniezione benzina banco 2\n" +
            "P062F Modulo controllo interno errore EEPROM\n" +
            "P0630 VIN errato in centralina motore\n" +
            "P0631 VIN errato in centralina trazione\n" +
            "P0632 Odometro non programmato - ECM/PCM\n" +
            "P0633 Chiave Immobilizer non programmata\n" +
            "P0634 Temperatura interna troppo alta\n" +
            "P0635 Attuat. servosterzo\n" +
            "P0636 Attuat. servosterzo cc a -\n" +
            "P0637 Attuat. servosterzo cc a +\n" +
            "P0638 Attuat. farfalla B1 s.errato\n" +
            "P0639 Attuat. farfalla B2 s.errato\n" +
            "P0640 Circ. riscald aria aspirata\n" +
            "P0641 Avaria tensione di riferimento A\n" +
            "P0642 Riferimento sensore voltaggio A\n" +
            "P0643 Riferimento sensore voltaggio A\n" +
            "P0644 Comunicazione seriale drive display\n" +
            "P0645 Circuito relè AC\n" +
            "P0646 Circuito relè AC cc a -\n" +
            "P0647 Circuito relè AC cc a +\n" +
            "P0648 Spia immobilizzatore\n" +
            "P0649 Spia controllo velocità\n" +
            "P0650 Spia malfunzionamento (MIL)\n" +
            "P0651 Avaria tensione di riferimento B\n" +
            "P0652 Tensione di riferimento sensore B-circuito\n" +
            "basso\n" +
            "P0653 Tensione B di riferimento del sensore\n" +
            "P0654 Circuito uscita giri motore\n" +
            "P0655 Spia sovratemperatura motore\n" +
            "P0656 Indicatore livello carburante\n" +
            "P0657 Voltaggio A attuatore rifornimento\n" +
            "P0658 Voltaggio A attuatore rifornimento\n" +
            "P0659 Voltaggio A attuatore rifornimento\n" +
            "P0660 Valv. regolaz. aspirazione B1\n" +
            "P0661 Valv. reg. aspirazione B1 cc a -\n" +
            "P0662 Valv. reg. aspirazione B1 cc a +\n" +
            "P0663 Valv. regolaz. aspirazione B2\n" +
            "P0664 Valv. reg. aspirazione B2 cc a -\n" +
            "P0665 Valv. reg. aspirazione B2 cc a +\n" +
            "P0666 Sensore temperatura interna\n" +
            "PCM/ECM/TCM\n" +
            "P0667 Sensore temperatura interna\n" +
            "PCM/ECM/TCM\n" +
            "P0668 Sensore temperatura interna\n" +
            "PCM/ECM/TCM\n" +
            "P0669 Sensore temperatura interna\n" +
            "PCM/ECM/TCM\n" +
            "P0670 Modulo di controllo candela d`accensione\n" +
            "P0671 Candela d`accensione cilindro 1\n" +
            "P0672 Candela d`accensione cilindro 2\n" +
            "P0673 Candela d`accensione cilindro 3\n" +
            "P0674 Candela d`accensione cilindro 4\n" +
            "P0675 Candela d`accensione cilindro 5\n" +
            "P0676 Candela d`accensione cilindro 6\n" +
            "P0677 Candela d`accensione cilindro 7\n" +
            "P0678 Candela d`accensione cilindro 8\n" +
            "P0679 Candela d`accensione cilindro 9\n" +
            "P0680 Candela d`accensione cilindro 10\n" +
            "P0681 Candela d`accensione cilindro 11\n" +
            "P0682 Candela d`accensione cilindro 12\n" +
            "P0683 Controllo candela accensione\n" +
            "P0684 Controllo candela accensione\n" +
            "P0685 Relè controllo frizione aperta\n" +
            "P0686 Relè di controllo alimentazione ECM/PCM\n" +
            "P0687 Relè di controllo alimentazione ECM/PCM\n" +
            "P0688 Monitoraggio relè alimentazione ECM/PCM\n" +
            "P0689 Monitoraggio relè alimentazione ECM/PCM\n" +
            "P0690 Monitoraggio relè alimentazione ECM/PCM\n" +
            "P0691 Controllo ventola 1 - segnale basso\n" +
            "P0692 Controllo ventola 1 - segnale alto\n" +
            "P0693 Controllo ventola 2 - segnale basso\n" +
            "P0694 Controllo ventola 2 - segnale alto\n" +
            "P0695 Controllo ventola 3 - segnale basso\n" +
            "P0696 Controllo ventola 3 - segnale alto\n" +
            "P0697 Tensione C di riferimento del sensore\n" +
            "P0698 Tensione C di riferimento del sensore\n" +
            "P0699 Tensione C di riferimento del sensore\n" +
            "P0700 Controllo trasmissione\n" +
            "P0701 Controllo trasmissione s.errato\n" +
            "P0702 Controllo trasmissione p.elettrico\n" +
            "P0703 Circ. B interr. freni/conv. coppia\n" +
            "P0704 Interruttore frizione\n" +
            "P0705 Ingresso marcia cambio\n" +
            "P0706 Ingresso marcia s.errato\n" +
            "P0707 Ingresso marcia cc a -\n" +
            "P0708 Ingresso marcia cc a +\n" +
            "P0709 Ingresso marcia intermitt.\n" +
            "P0710 Sens. temp. trasmissione\n" +
            "P0711 Sens. temp. trasmiss. s.errato\n" +
            "P0712 Sens. temp. trasmiss. cc a -\n" +
            "P0713 Sens. temp. trasmiss. cc a +\n" +
            "P0714 Sens. temp. trasmiss. intermitt.\n" +
            "P0715 Sens.vel.turbina/Vel.ang.disco frizione\n" +
            "P0716 Sens. velocità turbina s.errato\n" +
            "P0717 Sens. vel. turbina senza segnale\n" +
            "P0718 Sens. velocità turbina intermitt.\n" +
            "P0719 Circ. B interr. freni cc a -\n" +
            "P0720 Sens. giri trasmissione / Velocità auto\n" +
            "P0721 Sensore giri trasmiss. s.errato\n" +
            "P0722 Sens. giri trasmiss. senza segnale\n" +
            "P0723 Sensore giri trasmiss. intermitt.\n" +
            "P0724 Circ. B interr. freni cc a +\n" +
            "P0725 Segnale giri motore/Vel. angolare motore\n" +
            "P0726 Trasmiss. segn. giri motore errato\n" +
            "P0727 Trasmiss. senza segn. giri motore\n" +
            "P0728 Trasmiss. segn.giri motore interm.\n" +
            "P0729 Rapporto marcia 6 non corretto\n" +
            "P0730 Rapporto marcia errato\n" +
            "P0731 Rapporto 1a marcia errato\n" +
            "P0732 Rapporto 2a marcia errato\n" +
            "P0733 Rapporto 3a marcia errato\n" +
            "P0734 Rapporto 4a marcia errato\n" +
            "P0735 Rapporto 5a marcia errato\n" +
            "P0736 Rapporto retromarcia errato\n" +
            "P0737 TCM circ. veloc. motore\n" +
            "P0738 TCM circ. veloc. motore cc a -\n" +
            "P0739 TCM circ. veloc. motore cc a +\n" +
            "P0740 Frizione conv. coppia\n" +
            "P0741 Frizione conv. coppia OFF\n" +
            "P0742 Frizione conv. coppia ON\n" +
            "P0743 Frizione conv. coppia p.elettrico\n" +
            "P0744 Frizione conv. coppia intermitt.\n" +
            "P0745 Solen. A contr. P\n" +
            "P0746 Solen. A contr. P OFF\n" +
            "P0747 Solen. A contr. P ON\n" +
            "P0748 Solen. A contr. P p.elettrico\n" +
            "P0749 Solen. A contr. P intermitt.\n" +
            "P0750 Solenoide A cambio\n" +
            "P0751 Solen. A cambio OFF\n" +
            "P0752 Solen. A cambio ON\n" +
            "P0753 Solen. A cambio p.elettrico\n" +
            "P0754 Solen. A cambio intermitt.\n" +
            "P0755 Solenoide B cambio\n" +
            "P0756 Solen. B cambio OFF\n" +
            "P0757 Solen. B cambio ON\n" +
            "P0758 Solen. B cambio p.elettrico\n" +
            "P0759 Solen. B cambio intermitt.\n" +
            "P075A Solenoide G cambio\n" +
            "P075B Solenoide G cambio OFF\n" +
            "P075C Solenoide G cambio ON\n" +
            "P075D Solenoide G P.Elettrico\n" +
            "P075E Solenoide G P.Intermittente\n" +
            "P0760 Solenoide C cambio\n" +
            "P0761 Solen. C cambio OFF\n" +
            "P0762 Solen. C cambio ON\n" +
            "P0763 Solen. C cambio p.elettrico\n" +
            "P0764 Solen. C cambio intermitt.\n" +
            "P0765 Solenoide D cambio\n" +
            "P0766 Solen. D cambio OFF\n" +
            "P0767 Solen. D cambio ON\n" +
            "P0768 Solen. D cambio p.elettrico\n" +
            "P0769 Solen. D cambio intermitt.\n" +
            "P076A Solenoide H cambio\n" +
            "P076B Solenoide H cambio OFF\n" +
            "P076C Solenoide H cambio ON\n" +
            "P076D Solenoide H P.Elettrico\n" +
            "P076E Solenoide H P.Intermittente\n" +
            "P0770 Solenoide E cambio\n" +
            "P0771 Solen. E cambio OFF\n" +
            "P0772 Solen. E cambio ON\n" +
            "P0773 Solen. E cambio p.elettrico\n" +
            "P0774 Solen. E cambio intermitt.\n" +
            "P0775 Solen. B contr. P\n" +
            "P0776 Solen. B contr. P OFF\n" +
            "P0777 Solen. B contr. P ON\n" +
            "P0778 Solen. B contr. P p.elettrico\n" +
            "P0779 Solen. B contr. P intermitt.\n" +
            "P0780 Cambio\n" +
            "P0781 Cambio 1-2\n" +
            "P0782 Cambio 2-3\n" +
            "P0783 Cambio 3-4\n" +
            "P0784 Cambio 4-5\n" +
            "P0785 Solenoide cambio/fasatura\n" +
            "P0786 Solen. cambio s.errato\n" +
            "P0787 Solen. cambio cc a -\n" +
            "P0788 Solen. cambio cc a +\n" +
            "P0789 Solen. cambio intermitt.\n" +
            "P0790 Int. normale-sport / Int. auto incollato\n" +
            "P0791 Sens. vel. albero intermedio\n" +
            "P0792 Sens. vel. albero intermedio\n" +
            "P0793 Sens. vel. albero intermedio\n" +
            "P0794 Sens. vel. albero intermedio\n" +
            "P0795 Solen. C contr. P\n" +
            "P0796 Solen. C contr. P OFF\n" +
            "P0797 Solen. C contr. P ON\n" +
            "P0798 Solen. C contr. P p.elettrico\n" +
            "P0799 Solen. C contr. P intermitt.\n" +
            "P0800 Sistema di comando scatola di rinvio, richiesta spia di segnalazione avaria-funzionamento difettoso\n" +
            "P0801 Inibizione retromarcia\n" +
            "P0802 Sistema di controllo cambio, richiesta spia di segnalazione avaria-circuito interrotto\n" +
            "P0803 Solen. aumento marcia 1-4\n" +
            "P0804 Spia aumento marcia 1-4\n" +
            "P0805 Sens. pos. frizione\n" +
            "P0806 Sens. pos. frizione s.errato\n" +
            "P0807 Sens. pos. frizione cc a -\n" +
            "P0808 Sens. pos. frizione cc a +\n" +
            "P0809 Sens. pos. frizione intermitt.\n" +
            "P080A Posizione frizione non rilevata\n" +
            "P080B Controllo cambio marcia fuori range\n" +
            "P080C Controllo cambio marcia-Segnale basso\n" +
            "P080D Controllo cambio marcia-Segnale alto\n" +
            "P0810 Attuatore frizione\n" +
            "P0811 Slittamento frizione\n" +
            "P0812 Ingresso retromarcia\n" +
            "P0813 Uscita retromarcia\n" +
            "P0814 Visualizz. campo trasmiss.\n" +
            "P0815 Interrutt cambio verso alto\n" +
            "P0816 Interrutt cambio verso basso\n" +
            "P0817 Disabilit. motorino avviamento\n" +
            "P0818 Interr. scolleg. albero trasmiss.\n" +
            "P0819 Correl.interr.leva cambio e trasmissione\n" +
            "P081A Dispositivo avviamento disabilitato\n" +
            "P081B Dispositivo avviamento disabilitato\n" +
            "P081C Circuito di input posizione parking\n" +
            "P081D Circuito di input posizione neutral\n" +
            "P081D Slittamento eccessivo frizione B\n" +
            "P0820 Sens. pos. XY leva cambio\n" +
            "P0821 Sens. pos. X leva cambio\n" +
            "P0822 Sens. pos. Y leva cambio\n" +
            "P0823 Sens. X leva cambio intermitt.\n" +
            "P0824 Sens. Y leva cambio intermitt.\n" +
            "P0825 Interr. push-pull leva cambio\n" +
            "P0826 Circuito input interruttore leva cambio\n" +
            "P0827 Circuito input interruttore leva cambio\n" +
            "P0828 Circuito input interruttore leva cambio\n" +
            "P0829 Spostamento 5-6\n" +
            "P0830 Interr. frizione A\n" +
            "P0831 Interr. frizione A cc a -\n" +
            "P0832 Interr. frizione A cc a +\n" +
            "P0833 Interr. frizione B\n" +
            "P0834 Interr. frizione B cc a -\n" +
            "P0835 Interr. frizione B cc a +\n" +
            "P0836 Interr. 4WD\n" +
            "P0837 Interr. WD s.errato\n" +
            "P0838 Interr. WD cc a -\n" +
            "P0839 Interr. 4WD cc a +\n" +
            "P083A Sensore G pressione fluido trasmissione\n" +
            "P083B Sensore G pressione fluido trasmissione\n" +
            "P083C Sensore G pressione fluido trasmissione\n" +
            "P083D Sensore G pressione fluido trasmissione\n" +
            "P083E Sensore G pressione fluido trasmissione\n" +
            "P0840 Sens. P trasmiss. A\n" +
            "P0841 Sens. P trasmiss. A s.errato\n" +
            "P0842 Sens. P trasmiss. A cc a -\n" +
            "P0843 Sens. P trasmiss. A cc a +\n" +
            "P0844 Sens. P trasmiss. A intermitt.\n" +
            "P0845 Sens. P trasmiss. B\n" +
            "P0846 Sens. P trasmiss. B s.errato\n" +
            "P0847 Sens. P trasmiss. B cc a -\n" +
            "P0848 Sens. P trasmiss. B cc a +\n" +
            "P0849 Sens. P trasmiss. B intermitt.\n" +
            "P084A Sensore H pressione fluido trasmissione\n" +
            "P084B Sensore H pressione fluido trasmissione\n" +
            "P084C Sensore H pressione fluido trasmissione\n" +
            "P084D Sensore H pressione fluido trasmissione\n" +
            "P084E Sensore H pressione fluido trasmissione\n" +
            "P0850 Circuito input interruttore Park/Neutral\n" +
            "P0851 Circuito input interruttore Park/Neutral\n" +
            "P0852 Circuito input interruttore Park/Neutral\n" +
            "P0853 Circuito input azionamento interruttore\n" +
            "P0854 Circuito input azionamento interruttore\n" +
            "P0855 Circuito input azionamento interruttore\n" +
            "P0856 Segnale input controllo trazione\n" +
            "P0857 Segnale input controllo trazione\n" +
            "P0858 Segnale input controllo trazione\n" +
            "P0859 Segnale input controllo trazione\n" +
            "P0860 Modulo comunicazione interruttore cambio\n" +
            "P0861 Modulo comunicazione interruttore cambio\n" +
            "P0862 Modulo comunicazione interruttore cambio\n" +
            "P0863 Circuito comunicazione TCM\n" +
            "P0864 Circuito comunicazione TCM\n" +
            "P0865 Circuito comunicazione TCM\n" +
            "P0866 Circuito comunicazione TCM\n" +
            "P0867 Pressione fluido trasmissione\n" +
            "P0868 Pressione bassa fluido trasmissione\n" +
            "P0869 Pressione alta fluido trasmissione\n" +
            "P0870 Sensore C pressione fluido trasmissione\n" +
            "P0871 Sensore C pressione fluido trasmissione\n" +
            "P0872 Sensore C pressione fluido trasmissione\n" +
            "P0873 Sensore C pressione fluido trasmissione\n" +
            "P0874 Sensore C pressione fluido trasmissione\n" +
            "P0875 Sensore D pressione fluido trasmissione\n" +
            "P0876 Sensore D pressione fluido trasmissione\n" +
            "P0877 Sensore D pressione fluido trasmissione\n" +
            "P0878 Sensore D pressione fluido trasmissione\n" +
            "P0879 Sensore D pressione fluido trasmissione\n" +
            "P0880 Input Alimentazione TCM\n" +
            "P0881 Input Alimentazione TCM - fuori range\n" +
            "P0882 Input Alimentazione TCM-Segnale basso\n" +
            "P0883 Input Alimentazione TCM-Segnale alto\n" +
            "P0884 Input alimentazione TCM-Intermittente\n" +
            "P0885 Controllo Relè Alim.TCM-Circuito Aperto\n" +
            "P0886 Controllo Relè Alim.TCM-Segnale Basso\n" +
            "P0887 Controllo Relè Alim.TCM-Segnale Alto\n" +
            "P0888 Monitoraggio Relè Alimentazione TCM\n" +
            "P0889 Monitoraggio Relè Alimentazione TCM\n" +
            "P0890 Monitoraggio Relè Alimentazione TCM\n" +
            "P0891 Monitoraggio Relè Alimentazione TCM\n" +
            "P0892 Monitoraggio Relè Alimentazione TCM\n" +
            "P0893 Più marce inserite\n" +
            "P0894 Slittamento componente di trasmissione\n" +
            "P0895 Tempo inserimento marce troppo corto\n" +
            "P0896 Tempo inserimento marce troppo lungo\n" +
            "P0897 Fluido di trasmissione deteriorato\n" +
            "P0898 Sistema controllo trasmissione MIL\n" +
            "P0899 Sistema controllo trasmissione MIL\n" +
            "P0900 Azionatore frizione - Circuito aperto\n" +
            "P0901 Azionatore frizione - fuori range\n" +
            "P0902 Azionatore frizione - Segnale basso\n" +
            "P0903 Azionatore frizione - Segnale alto\n" +
            "P0904 Circuito posizione selettore marce\n" +
            "P0905 Posizione selettore marce\n" +
            "P0906 Posizione selettore marce\n" +
            "P0907 Posizione selettore marce\n" +
            "P0908 Posizione selettore marce\n" +
            "P0909 Controllo errore selettore marce\n" +
            "P0910 Attuatore selettore marce\n" +
            "P0911 Attuatore selettore marce\n" +
            "P0912 Attuatore selettore marce\n" +
            "P0913 Attuatore selettore marce\n" +
            "P0914 Circuito posizione leva cambio\n" +
            "P0915 Posizione leva cambio - Fuori range\n" +
            "P0916 Posizione leva cambio - Segnale basso\n" +
            "P0917 Posizione leva cambio - Segnale Alto\n" +
            "P0918 Posizione leva cambio - Intermittente\n" +
            "P0919 Controllo errore posizione leva cambio\n" +
            "P0920 Attuatore Marcia avanti leva cambio\n" +
            "P0921 Attuatore Marcia avanti leva cambio\n" +
            "P0922 Attuatore Marcia avanti leva cambio\n" +
            "P0923 Attuatore Marcia avanti leva cambio\n" +
            "P0924 Attuatore retro marcia leva cambio\n" +
            "P0925 Attuatore retro marcia leva cambio\n" +
            "P0926 Attuatore retro marcia leva cambio\n" +
            "P0927 Attuatore retro marcia leva cambio\n" +
            "P0928 Solenoide blocco leva cambio\n" +
            "P0929 Solenoide blocco leva cambio\n" +
            "P0930 Solenoide blocco leva cambio\n" +
            "P0931 Solenoide blocco leva cambio\n" +
            "P0932 Sensore pressione idraulica\n" +
            "P0933 Sensore pressione idraulica\n" +
            "P0934 Sensore pressione idraulica\n" +
            "P0935 Sensore pressione idraulica\n" +
            "P0936 Sensore pressione idraulica\n" +
            "P0937 Sensore temperatura olio idraulico\n" +
            "P0938 Sensore temperatura olio idraulico\n" +
            "P0939 Sensore temperatura olio idraulico\n" +
            "P0940 Sensore temperatura olio idraulico\n" +
            "P0941 Sensore temperatura olio idraulico\n" +
            "P0942 Unità di pressione idraulica\n" +
            "P0943 Periodo Unità Press.idraulica Corto\n" +
            "P0944 Unità pressione idraulica\n" +
            "P0945 Relè pompa idraulica - circuito aperto\n" +
            "P0946 Relè pompa idraulica - fuori range\n" +
            "P0947 Relè pompa idraulica - Segnale basso\n" +
            "P0948 Relè pompa idraulica - Segnale alto\n" +
            "P0949 Adattamento manuale cambio automatico\n" +
            "P0950 Controllo manuale cambio automatico\n" +
            "P0951 Controllo manuale cambio automatico\n" +
            "P0952 Controllo manuale cambio automatico\n" +
            "P0953 Controllo manuale cambio automatico\n" +
            "P0954 Controllo manuale cambio automatico\n" +
            "P0955 Modo manuale cambio automatico\n" +
            "P0956 Modo manuale cambio automatico\n" +
            "P0957 Modo manuale cambio automatico\n" +
            "P0958 Modo manuale cambio automatico\n" +
            "P0959 Modo manuale cambio automatico\n" +
            "P0960 Solenoide A controllo pressione\n" +
            "P0961 Solenoide A controllo pressione\n" +
            "P0962 Solenoide A controllo pressione\n" +
            "P0963 Solenoide A controllo pressione\n" +
            "P0964 Solenoide B controllo pressione\n" +
            "P0965 Solenoide B controllo pressione\n" +
            "P0966 Solenoide B controllo pressione\n" +
            "P0967 Solenoide B controllo pressione\n" +
            "P0968 Solenoide C controllo pressione\n" +
            "P0969 Solenoide C controllo pressione\n" +
            "P0970 Solenoide C controllo pressione\n" +
            "P0971 Solenoide C controllo pressione\n" +
            "P0972 Controllo solen.A cambio - Fuori range\n" +
            "P0973 Controllo solen.A cambio-Segnale basso\n" +
            "P0974 Controllo solen.A cambio-Segnale alto\n" +
            "P0975 Controllo solen.B cambio - Fuori range\n" +
            "P0976 Controllo solen.B cambio-Segnale basso\n" +
            "P0977 Controllo solen.B cambio-Segnale alto\n" +
            "P0978 Controllo solen.C cambio - Fuori range\n" +
            "P0979 Controllo solen.C cambio-Segnale basso\n" +
            "P0980 Controllo solen.C cambio-Segnale alto\n" +
            "P0981 Controllo solen.D cambio - Fuori range\n" +
            "P0982 Controllo solen.D cambio-Segnale basso\n" +
            "P0983 Controllo solen.D cambio-Segnale alto\n" +
            "P0984 Controllo solen.E cambio - Fuori range\n" +
            "P0985 Controllo solen.E cambio-Segnale basso\n" +
            "P0986 Controllo solen.E cambio-Segnale alto\n" +
            "P0987 Sensore E Pressione Fluido Trasmissione\n" +
            "P0988 Sensore E Pressione Fluido Trasmissione\n" +
            "P0989 Sensore E Pressione Fluido Trasmissione\n" +
            "P0990 Sensore E Pressione Fluido Trasmissione\n" +
            "P0991 Sensore E Pressione Fluido Trasmissione\n" +
            "P0992 Sensore F Pressione Fluido Trasmissione\n" +
            "P0993 Sensore F Pressione Fluido Trasmissione\n" +
            "P0994 Sensore F Pressione Fluido Trasmissione\n" +
            "P0995 Sensore F Pressione Fluido Trasmissione\n" +
            "P0996 Sensore F Pressione Fluido Trasmissione\n" +
            "P0997 Controllo solen.F cambio - Fuori range\n" +
            "P0998 Controllo solen.F cambio-Segnale basso\n" +
            "P0999 Controllo solen.F cambio-Segnale alto";
    static String P2000P245D = "P2000 Efficienza filtro ossidante\n" +
            "P2001 Efficienza filtro ossidante\n" +
            "P2002 Efficenza filtro particolato diesel\n" +
            "P2003 Efficenza filtro particolato diesel\n" +
            "P2004 Controllo collettore di aspirazione\n" +
            "P2005 Controllo collettore di aspirazione\n" +
            "P2006 Controllo collettore di aspirazione\n" +
            "P2007 Controllo collettore di aspirazione\n" +
            "P2008 Controllo collettore di aspirazione\n" +
            "P2009 Controllo collettore di aspirazione\n" +
            "P2010 Controllo collettore di aspirazione\n" +
            "P2011 Controllo collettore di aspirazione\n" +
            "P2012 Controllo collettore di aspirazione\n" +
            "P2013 Controllo collettore di aspirazione\n" +
            "P2014 Posizione collettore di aspirazione\n" +
            "P2015 Posizione collettore di aspirazione\n" +
            "P2016 Posizione collettore di aspirazione\n" +
            "P2017 Posizione collettore di aspirazione\n" +
            "P2018 Posizione collettore di aspirazione\n" +
            "P2019 Posizione collettore di aspirazione\n" +
            "P2020 Posizione collettore di aspirazione\n" +
            "P2021 Posizione collettore di aspirazione\n" +
            "P2022 Posizione collettore di aspirazione\n" +
            "P2023 Posizione collettore di aspirazione\n" +
            "P2024 Sensore temperatura vapori carburante\n" +
            "P2025 Sensore temperatura vapori carburante\n" +
            "P2026 Sensore temperatura vapori carburante\n" +
            "P2027 Sensore temperatura vapori carburante\n" +
            "P2028 Sensore temperatura vapori carburante\n" +
            "P2029 Riscaldatore carburante iniettato\n" +
            "P2030 Prestazione riscaldatore carburante\n" +
            "P2031 Sensore temperatura gas di scarico\n" +
            "P2032 Sensore temperatura gas di scarico\n" +
            "P2033 Sensore temperatura gas di scarico\n" +
            "P2034 Sensore temperatura gas di scarico\n" +
            "P2035 Sensore temperatura gas di scarico\n" +
            "P2036 Sensore temperatura gas di scarico\n" +
            "P2037 Sensore pressione aria\n" +
            "P2038 Sensore pressione aria\n" +
            "P2039 Sensore pressione aria\n" +
            "P203A Sensore livello riduzione\n" +
            "P203B Sensore livello riduzione\n" +
            "P203C Sensore livello riduzione\n" +
            "P203D Sensore livello riduzione\n" +
            "P203E Sensore livello riduzione\n" +
            "P203F Livello riduzione basso\n" +
            "P2040 Sens.pressione aria iniezione riducente\n" +
            "P2041 Sens.pressione aria iniezione riducente\n" +
            "P2042 Sensore temperatura riduzione\n" +
            "P2043 Sensore temperatura riduzione\n" +
            "P2044 Sensore temperatura riduzione\n" +
            "P2045 Sensore temperatura riduzione\n" +
            "P2046 Sensore temperatura riduzione\n" +
            "P2047 Iniettore riduzione - circuito aperto\n" +
            "P2048 Iniettore riduzione - segnale basso\n" +
            "P2049 Iniettore riduzione - segnale alto\n" +
            "P204A Sensore pressione riducente\n" +
            "P204B Sensore pressione riducente\n" +
            "P204C Sensore pressione riducente\n" +
            "P204D Sensore pressione riducente\n" +
            "P204E Sensore pressione riducente\n" +
            "P2050 Iniettore riduzione - circuito aperto\n" +
            "P2051 Iniettore riduzione - segnale basso\n" +
            "P2052 Iniettore riduzione - segnale alto\n" +
            "P2053 Iniettore riduzione - circuito aperto\n" +
            "P2054 Iniettore riduzione - segnale basso\n" +
            "P2055 Iniettore riduzione - segnale alto\n" +
            "P2056 Iniettore riduzione - circuito aperto\n" +
            "P2057 Iniettore riduzione - segnale basso\n" +
            "P2058 Iniettore riduzione - segnale alto\n" +
            "P2059 Controllo pompa aria\n" +
            "P205A Sensore temperatura serbatoio\n" +
            "P205B Sensore temperatura serbatoio\n" +
            "P205C Sensore temperatura serbatoio\n" +
            "P205D Sensore temperatura serbatoio\n" +
            "P205E Sensore temperatura serbatoio\n" +
            "P2060 Controllo pompa aria\n" +
            "P2061 Controllo pompa aria\n" +
            "P2062 Controllo rifornimento riducente gassoso\n" +
            "P2063 Controllo rifornimento riducente gassoso\n" +
            "P2064 Controllo rifornimento riducente gassoso\n" +
            "P2065 Sensore B livello carburante\n" +
            "P2066 Sensore B livello carburante\n" +
            "P2067 Sensore B livello carburante\n" +
            "P2068 Sensore B livello carburante\n" +
            "P2069 Sensore B livello carburante\n" +
            "P206E Valvola sincroniz.collettore aspiraz.\n" +
            "P206F Valvola sincroniz.collettore aspiraz.\n" +
            "P2070 Valvola sincroniz.collettore aspiraz.\n" +
            "P2071 Valvola sincroniz.collettore aspiraz.\n" +
            "P2072 Controllo Attuatore valvola farfalla\n" +
            "P2073 Collett.press/massa assoluta flusso aria\n" +
            "P2074 Collett.press/massa assoluta flusso aria\n" +
            "P2075 Sens.posizione valv.collettore aspiraz.\n" +
            "P2076 Sens.posizione valv.collettore aspiraz.\n" +
            "P2077 Sens.posizione valv.collettore aspiraz.\n" +
            "P2078 Sens.posizione valv.collettore aspiraz.\n" +
            "P2079 Sens.posizione valv.collettore aspiraz.\n" +
            "P207A Sens.posizione valv.collettore aspiraz.\n" +
            "P207B Sens.posizione valv.collettore aspiraz.\n" +
            "P207C Sens.posizione valv.collettore aspiraz.\n" +
            "P207D Sens.posizione valv.collettore aspiraz.\n" +
            "P207E Sens.posizione valv.collettore aspiraz.\n" +
            "P2080 Sensore temperatura gas di scarico\n" +
            "P2081 Sensore temperatura gas di scarico\n" +
            "P2082 Sensore temperatura gas di scarico\n" +
            "P2083 Sensore temperatura gas di scarico\n" +
            "P2084 Sensore temperatura gas di scarico\n" +
            "P2085 Sensore temperatura gas di scarico\n" +
            "P2086 Sensore temperatura gas di scarico\n" +
            "P2087 Sensore temperatura gas di scarico\n" +
            "P2088 Controllo posiz.attuatore albero camme A\n" +
            "P2089 Controllo posiz.attuatore albero camme A\n" +
            "P2090 Controllo posiz.attuatore albero camme B\n" +
            "P2091 Controllo posiz.attuatore albero camme B\n" +
            "P2092 Controllo posiz.attuatore albero camme A\n" +
            "P2093 Controllo posiz.attuatore albero camme A\n" +
            "P2094 Controllo posiz.attuatore albero camme B\n" +
            "P2095 Controllo posiz.attuatore albero camme B\n" +
            "P2096 Regolazione lambda dopo il catalizzatore\n" +
            "P2097 Regolazione lambda dopo il catalizzatore\n" +
            "P2098 Regolazione lambda dopo il catalizzatore\n" +
            "P2099 Regolazione lambda dopo il catalizzatore\n" +
            "P2100 Motore controllo attuatore valv.farfalla\n" +
            "P2101 Motore controllo attuatore valv.farfalla\n" +
            "P2102 Motore controllo attuatore valv.farfalla\n" +
            "P2103 Motore controllo attuatore valv.farfalla\n" +
            "P2104 Sist. controllo attuatore valv.farfalla\n" +
            "P2105 Sist. controllo attuatore valv.farfalla\n" +
            "P2106 Sist. controllo attuatore valv.farfalla\n" +
            "P2107 Processore contr.attuat.valv.farfalla\n" +
            "P2108 Prestaz.controllo attuat.valv.farfalla\n" +
            "P2109 Sensore A posizione farfalla/pedale\n" +
            "P2110 Controllo Attuatore valvola farfalla\n" +
            "P2111 Controllo Attuatore valvola farfalla\n" +
            "P2112 Controllo Attuatore valvola farfalla\n" +
            "P2113 Controllo Attuatore valvola farfalla\n" +
            "P2114 Controllo Attuatore valvola farfalla\n" +
            "P2115 Controllo Attuatore valvola farfalla\n" +
            "P2116 Controllo Attuatore valvola farfalla\n" +
            "P2117 Controllo Attuatore valvola farfalla\n" +
            "P2118 Corrente motore attuatore valv.farfalla\n" +
            "P2119 Controllo Attuatore valvola farfalla\n" +
            "P2120 Sensore D posizione valv.farfalla/Pedale\n" +
            "P2121 Sensore D posizione valv.farfalla/Pedale\n" +
            "P2122 Sensore D posizione valv.farfalla/Pedale\n" +
            "P2123 Sensore D posizione valv.farfalla/Pedale\n" +
            "P2124 Sensore D posizione valv.farfalla/Pedale\n" +
            "P2125 Sensore E posizione valv.farfalla/Pedale\n" +
            "P2126 Sensore E posizione valv.farfalla/Pedale\n" +
            "P2127 Sensore E posizione valv.farfalla/Pedale\n" +
            "P2128 Sensore E posizione valv.farfalla/Pedale\n" +
            "P2129 Sensore E posizione valv.farfalla/Pedale\n" +
            "P2130 Sensore F posizione valv.farfalla/Pedale\n" +
            "P2131 Sensore F posizione valv.farfalla/Pedale\n" +
            "P2132 Sensore F posizione valv.farfalla/Pedale\n" +
            "P2133 Sensore F posizione valv.farfalla/Pedale\n" +
            "P2134 Sensore F posizione valv.farfalla/Pedale\n" +
            "P2135 Correlazione sensore A/B valv.farfalla/Pedale\n" +
            "P2136 Correlazione sensore A/C valv.farfalla/Pedale\n" +
            "P2137 Correlazione sensore B/C valv.farfalla/Pedale\n" +
            "P2138 Correlazione sensore D/E valv.farfalla/Pedale\n" +
            "P2139 Correlazione sensore D/F valv.farfalla/Pedale\n" +
            "P2140 Correlazione sensore E/F valv.farfalla/Pedale\n" +
            "P2141 Valvola farfalla ricircolo gas scarico\n" +
            "P2142 Valvola farfalla ricircolo gas scarico\n" +
            "P2143 Bocchetta ricircolo gas di scarico\n" +
            "P2144 Bocchetta ricircolo gas di scarico\n" +
            "P2145 Bocchetta ricircolo gas di scarico\n" +
            "P2146 Tensione alimentazione iniettore carburante\n" +
            "P2147 Tensione alimentazione iniettore carburante\n" +
            "P2148 Tensione alimentazione iniettore carburante\n" +
            "P2149 Tensione alimentazione iniettore carburante\n" +
            "P2150 Tensione alimentazione iniettore carburante\n" +
            "P2151 Tensione alimentazione iniettore carburante\n" +
            "P2152 Tensione alimentazione iniettore carburante\n" +
            "P2153 Tensione alimentazione iniettore carburante\n" +
            "P2154 Tensione alimentazione iniettore carburante\n" +
            "P2155 Tensione alimentazione iniettore carburante\n" +
            "P2156 Tensione alimentazione iniettore carburante\n" +
            "P2157 Tensione alimentazione iniettore carburante\n" +
            "P2158 Sensore B velocità veicolo\n" +
            "P2159 Sensore B velocità veicolo\n" +
            "P2160 Sensore B velocità veicolo\n" +
            "P2161 Sensore B velocità veicolo\n" +
            "P2162 Correlazione sens.A/B velocità veicolo\n" +
            "P2163 Sensore A posizione valv.farfalla/Pedale\n" +
            "P2164 Sensore B posizione valv.farfalla/Pedale\n" +
            "P2165 Sensore C posizione valv.farfalla/Pedale\n" +
            "P2166 Sensore D posizione valv.farfalla/Pedale\n" +
            "P2167 Sensore E posizione valv.farfalla/Pedale\n" +
            "P2168 Sensore F posizione valv.farfalla/Pedale\n" +
            "P2169 Solen.sfiato regolatore press.scarico\n" +
            "P2170 Solen.sfiato regolatore press.scarico\n" +
            "P2171 Solen.sfiato regolatore press.scarico\n" +
            "P2172 Controllo Attuatore valvola farfalla\n" +
            "P2173 Controllo Attuatore valvola farfalla\n" +
            "P2174 Controllo Attuatore valvola farfalla\n" +
            "P2175 Controllo Attuatore valvola farfalla\n" +
            "P2176 Controllo Attuatore valvola farfalla\n" +
            "P2177 Sistema troppo magro regime minimo off\n" +
            "P2178 Sistema troppo ricco regime minimo off\n" +
            "P2179 Sistema troppo magro regime minimo off\n" +
            "P2180 Sistema troppo ricco regime minimo off\n" +
            "P2181 Prestazione sistema refrigerante\n" +
            "P2182 Sens.2 temperatura refrigerante motore\n" +
            "P2183 Sens.2 temperatura refrigerante motore\n" +
            "P2184 Sens.2 temperatura refrigerante motore\n" +
            "P2185 Sens.2 temperatura refrigerante motore\n" +
            "P2186 Sens.2 temperatura refrigerante motore\n" +
            "P2187 Sistema troppo magro a regime minimo\n" +
            "P2188 Sistema troppo ricco a regime minimo\n" +
            "P2189 Sistema troppo magro a regime minimo\n" +
            "P2190 Sistema troppo ricco a regime minimo\n" +
            "P2191 Sistema troppo magro a pieno carico\n" +
            "P2192 Sistema troppo ricco a pieno carico\n" +
            "P2193 Sistema troppo magro a pieno carico\n" +
            "P2194 Sistema troppo ricco a pieno carico\n" +
            "P2195 Sonda lambda polarizzata/bloccata magra\n" +
            "P2196 Sonda lambda polarizzata/bloccata ricca\n" +
            "P2197 Sonda lambda polarizzata/bloccata magra\n" +
            "P2198 Sonda lambda polarizzata/bloccata ricca\n" +
            "P2199 Correlazione 1/2 temp.aria aspirata\n" +
            "P2200 Sensore Nox - bancata 1\n" +
            "P2201 Sensore Nox - bancata 1\n" +
            "P2202 Sensore Nox - bancata 1\n" +
            "P2203 Sensore Nox - bancata 1\n" +
            "P2204 Sensore Nox - bancata 1\n" +
            "P2205 Sensore NOx controllo riscaldatore\n" +
            "P2206 Sensore NOx controllo riscaldatore\n" +
            "P2207 Sensore NOx controllo riscaldatore\n" +
            "P2208 Sensore NOx misurazione riscaldamento\n" +
            "P2209 Sensore NOx misurazione riscaldamento\n" +
            "P2210 Sensore NOx misurazione riscaldamento\n" +
            "P2211 Sensore NOx misurazione riscaldamento\n" +
            "P2212 Sensore NOx misurazione riscaldamento\n" +
            "P2213 Sensore Nox - bancata 2\n" +
            "P2214 Sensore NOx - fuori range\n" +
            "P2215 Sensore NOx - input basso\n" +
            "P2216 Sensore NOx - input alto\n" +
            "P2217 Sensore NOx - segnale intermittente\n" +
            "P2218 Sensore NOx controllo riscaldatore\n" +
            "P2219 Sensore NOx controllo riscaldatore\n" +
            "P2220 Sensore NOx controllo riscaldatore\n" +
            "P2221 Sensore NOx misurazione riscaldamento\n" +
            "P2222 Sensore NOx misurazione riscaldamento\n" +
            "P2223 Sensore NOx misurazione riscaldamento\n" +
            "P2224 Sensore NOx misurazione riscaldamento\n" +
            "P2225 Sensore NOx misurazione riscaldamento\n" +
            "P2226 Pressione barometrica\n" +
            "P2227 Pressione barometrica\n" +
            "P2228 Pressione barometrica\n" +
            "P2229 Pressione barometrica\n" +
            "P2230 Pressione barometrica\n" +
            "P2231 Sonda lambda in corto col riscaldatore\n" +
            "P2232 Sonda lambda in corto col riscaldatore\n" +
            "P2233 Sonda lambda in corto col riscaldatore\n" +
            "P2234 Sonda lambda in corto col riscaldatore\n" +
            "P2235 Sonda lambda in corto col riscaldatore\n" +
            "P2236 Sonda lambda in corto col riscaldatore\n" +
            "P2237 Sonda lambda controllo corrente positivo\n" +
            "P2238 Sonda lambda controllo corrente positivo\n" +
            "P2239 Sonda lambda controllo corrente positivo\n" +
            "P2240 Sonda lambda controllo corrente positivo\n" +
            "P2241 Sonda lambda controllo corrente positivo\n" +
            "P2242 Sonda lambda controllo corrente positivo\n" +
            "P2243 sonda lambda tensione di riferimento\n" +
            "P2244 sonda lambda tensione di riferimento\n" +
            "P2245 sonda lambda tensione di riferimento\n" +
            "P2246 sonda lambda tensione di riferimento\n" +
            "P2247 sonda lambda tensione di riferimento\n" +
            "P2248 sonda lambda prestazione tensione rifer.\n" +
            "P2249 sonda lambda tensione di riferimento\n" +
            "P2250 sonda lambda tensione di riferimento\n" +
            "P2251 Sonda lambda controllo corrente negativo\n" +
            "P2252 Sonda lambda controllo corrente negativo\n" +
            "P2253 Sonda lambda controllo corrente negativo\n" +
            "P2254 Sonda lambda controllo corrente negativo\n" +
            "P2255 Sonda lambda controllo corrente negativo\n" +
            "P2256 Sonda lambda controllo corrente negativo\n" +
            "P2257 Controllo sist.secondario iniezione aria\n" +
            "P2258 Controllo sist.secondario iniezione aria\n" +
            "P2259 Controllo sist.secondario iniezione aria\n" +
            "P2260 Controllo sist.secondario iniezione aria\n" +
            "P2261 Valvola esclusione turbo\n" +
            "P2262 Pressione turbo non rilevata\n" +
            "P2263 Prestazione turbo\n" +
            "P2264 Sensore acqua nel combustibile\n" +
            "P2265 Sensore acqua nel combustibile\n" +
            "P2266 Sensore acqua nel combustibile\n" +
            "P2267 Sensore acqua nel combustibile\n" +
            "P2268 Sensore acqua nel combustibile\n" +
            "P2269 Condizione acqua nel carburante\n" +
            "P2270 Sonda lambda segnale bloccato magro\n" +
            "P2271 Sonda lambda segnale bloccato ricco\n" +
            "P2272 Sonda lambda segnale bloccato magro\n" +
            "P2273 Sonda lambda segnale bloccato ricco\n" +
            "P2274 Sonda lambda segnale bloccato magro\n" +
            "P2275 Sonda lambda segnale bloccato ricco\n" +
            "P2276 Sonda lambda segnale bloccato magro\n" +
            "P2277 Sonda lambda segnale bloccato ricco\n" +
            "P2278 Sensore ossigeno segnale scambiato\n" +
            "P2279 Perdita sistema aspirazione\n" +
            "P2280 Restrizione flusso aria/perdita aria\n" +
            "P2281 Perdita aria tra MAF e valv.farfalla\n" +
            "P2282 Perdita aria\n" +
            "P2283 Sensore controllo pressione iniettore\n" +
            "P2284 Sensore controllo pressione iniettore\n" +
            "P2285 Sensore controllo pressione iniettore\n" +
            "P2286 Sensore controllo pressione iniettore\n" +
            "P2287 Sensore controllo pressione iniettore\n" +
            "P2288 Controllo pressione iniettore\n" +
            "P2289 Controllo pressione iniettore\n" +
            "P2290 Controllo pressione iniettore\n" +
            "P2291 Controllo pressione iniettore\n" +
            "P2292 Controllo pressione iniettore\n" +
            "P2293 Prestaz.regolatore 2 press.-carburante\n" +
            "P2294 Regolatore 2 pressione carburante\n" +
            "P2295 Regolatore 2 pressione carburante\n" +
            "P2296 Regolatore 2 pressione carburante\n" +
            "P2297 Sonda lambda fuori range\n" +
            "P2298 Sonda lambda fuori range\n" +
            "P2299 Pos.pedale freno/acceler.incompatibile\n" +
            "P2300 Controllo primario bobina accensione(A)\n" +
            "P2301 Controllo primario bobina accensione(A)\n" +
            "P2302 Circ.secondario bobina accensione(A)\n" +
            "P2303 Controllo primario bobina accensione(B)\n" +
            "P2304 Controllo primario bobina accensione(B)\n" +
            "P2305 Circ.secondario bobina accensione(B)\n" +
            "P2306 Controllo primario bobina accensione©\n" +
            "P2307 Controllo primario bobina accensione(C )\n" +
            "P2308 Circ.secondario bobina accensione(C )\n" +
            "P2309 Controllo primario bobina accensione(D)\n" +
            "P2310 Controllo primario bobina accensione(D)\n" +
            "P2311 Circ.secondario bobina accensione(D)\n" +
            "P2312 Controllo primario bobina accensione(E)\n" +
            "P2313 Controllo primario bobina accensione(E)\n" +
            "P2314 Circ.secondario bobina accensione(E)\n" +
            "P2315 Controllo primario bobina accensione(F)\n" +
            "P2316 Controllo primario bobina accensione(F)\n" +
            "P2317 Circ.secondario bobina accensione(F)\n" +
            "P2318 Controllo primario bobina accensione(G)\n" +
            "P2319 Controllo primario bobina accensione(G)\n" +
            "P2320 Circ.secondario bobina accensione(G)\n" +
            "P2321 Controllo primario bobina accensione(H)\n" +
            "P2322 Controllo primario bobina accensione(H)\n" +
            "P2323 Circ.secondario bobina accensione(H)\n" +
            "P2324 Controllo primario bobina accensione(I)\n" +
            "P2325 Controllo primario bobina accensione(I)\n" +
            "P2326 Circ.secondario bobina accensione(I)\n" +
            "P2327 Controllo primario bobina accensione(J)\n" +
            "P2328 Controllo primario bobina accensione(J)\n" +
            "P2329 Circ.secondario bobina accensione(J)\n" +
            "P2330 Controllo primario bobina accensione(K)\n" +
            "P2331 Controllo primario bobina accensione(K)\n" +
            "P2332 Circ.secondario bobina accensione(K)\n" +
            "P2333 Controllo primario bobina accensione(L)\n" +
            "P2334 Controllo primario bobina accensione(L)\n" +
            "P2335 Circ.secondario bobina accensione(L)\n" +
            "P2336 Cilindro 1 sopra soglia di battito\n" +
            "P2337 Cilindro 2 sopra soglia di battito\n" +
            "P2338 Cilindro 3 sopra soglia di battito\n" +
            "P2339 Cilindro 4 sopra soglia di battito\n" +
            "P2340 Cilindro 5 sopra soglia di battito\n" +
            "P2341 Cilindro 6 sopra soglia di battito\n" +
            "P2342 Cilindro 7 sopra soglia di battito\n" +
            "P2343 Cilindro 8 sopra soglia di battito\n" +
            "P2344 Cilindro 9 sopra soglia di battito\n" +
            "P2345 Cilindro 10 sopra soglia di battito\n" +
            "P2346 Cilindro 11 sopra soglia di battito\n" +
            "P2347 Cilindro 12 sopra soglia di battito\n" +
            "P2400 Pompa controllo perdita emiss.evapor.\n" +
            "P2401 Pompa controllo perdita emiss.evapor.\n" +
            "P2402 Pompa controllo perdita emiss.evapor.\n" +
            "P2403 Monitor.pompa perdita emiss.evapor.\n" +
            "P2404 Monitor.pompa perdita emiss.evapor.\n" +
            "P2405 Monitor.pompa perdita emiss.evapor.\n" +
            "P2406 Monitor.pompa perdita emiss.evapor.\n" +
            "P2407 Monitor.pompa perdita emiss.evapor.\n" +
            "P2408 Sensore/interr.protezione carburante\n" +
            "P2409 Sensore/interr.protezione carburante\n" +
            "P2410 Sensore/interr.protezione carburante\n" +
            "P2411 Sensore/interr.protezione carburante\n" +
            "P2412 Sensore/interr.protezione carburante\n" +
            "P2413 Sistema ricircolo gas di scarico\n" +
            "P2414 Errore campionamento gas di scarico\n" +
            "P2415 Errore campionamento gas di scarico\n" +
            "P2416 Segnale sonda lambda scambiato\n" +
            "P2417 Segnale sonda lambda scambiato\n" +
            "P2418 Controllo Valv.Commutazione emiss.evap.\n" +
            "P2419 Controllo Valv.Commutazione emiss.evap.\n" +
            "P2420 Controllo Valv.Commutazione emiss.evap.\n" +
            "P2421 Valvola sfiato emissioni evaporative\n" +
            "P2422 Valvola sfiato emissioni evaporative\n" +
            "P2423 Efficienza catalizzatore assorbimento HC\n" +
            "P2424 Efficienza catalizzatore assorbimento HC\n" +
            "P2425 Valv.refrig.ricircolo gas scarico\n" +
            "P2426 Valv.refrig.ricircolo gas scarico\n" +
            "P2427 Valv.refrig.ricircolo gas scarico\n" +
            "P2428 Temperatura gas di scarico troppo alta\n" +
            "P2429 Temperatura gas di scarico troppo alta\n" +
            "P242A Sensore temperatura gas di scarico\n" +
            "P242B Sensore temperatura gas di scarico\n" +
            "P242C Sensore temperatura gas di scarico\n" +
            "P242D Sensore temperatura gas di scarico\n" +
            "P242E Sensore temperatura gas di scarico\n" +
            "P242F Restrizione filtro particolato diesel\n" +
            "P2430 Sistema secondario iniezione aria\n" +
            "P2431 Sistema secondario iniezione aria\n" +
            "P2432 Sistema secondario iniezione aria\n" +
            "P2433 Sistema secondario iniezione aria\n" +
            "P2434 Sistema secondario iniezione aria\n" +
            "P2435 Sistema secondario iniezione aria\n" +
            "P2436 Sistema secondario iniezione aria\n" +
            "P2437 Sistema secondario iniezione aria\n" +
            "P2438 Sistema secondario iniezione aria\n" +
            "P2439 Sistema secondario iniezione aria\n" +
            "P2440 Valv.commut.sistema sec.iniezione aria\n" +
            "P2441 Valv.commut.sistema sec.iniezione aria\n" +
            "P2442 Valv.commut.sistema sec.iniezione aria\n" +
            "P2443 Valv.commut.sistema sec.iniezione aria\n" +
            "P2444 Sistema secondario iniezione aria\n" +
            "P2445 Sistema secondario iniezione aria\n" +
            "P2446 Sistema secondario iniezione aria\n" +
            "P2447 Sistema secondario iniezione aria\n" +
            "P2448 Sistema secondario iniezione aria\n" +
            "P2449 Sistema secondario iniezione aria\n" +
            "P2450 Sistema controllo emissioni evaporative\n" +
            "P2451 Sistema controllo emissioni evaporative\n" +
            "P2452 Sensore pressione filtro diesel\n" +
            "P2453 Sensore pressione filtro diesel\n" +
            "P2454 Sensore pressione filtro diesel\n" +
            "P2455 Sensore pressione filtro diesel\n" +
            "P2456 Sensore pressione filtro diesel\n" +
            "P2457 Sistema refrig.ricircolo gas scarico\n" +
            "P2458 Durata rigenerazione filtro diesel\n" +
            "P2459 Frequenza rigenerazione filtro diesel\n" +
            "P245A Esclusione refrigerante gas scarico\n" +
            "P245B Esclusione refrigerante gas scarico\n" +
            "P245C Esclusione refrigerante gas scarico\n" +
            "P245D Esclusione refrigerante gas scarico";
    static String P2500P2A11 = "P2500 Terminale spia generatore\n" +
            "P2501 Terminale spia generatore\n" +
            "P2502 Tensione ricarica del sistema\n" +
            "P2503 Tensione ricarica del sistema\n" +
            "P2504 Tensione ricarica del sistema\n" +
            "P2505 Segnale input alimentazione ECM/PCM\n" +
            "P2506 Segnale input alimentazione ECM/PCM\n" +
            "P2507 Segnale input alimentazione ECM/PCM\n" +
            "P2508 Segnale input alimentazione ECM/PCM\n" +
            "P2509 Segnale input alimentazione ECM/PCM\n" +
            "P250A Sensore livello olio motore\n" +
            "P250B Sensore livello olio motore\n" +
            "P250C Sensore livello olio motore\n" +
            "P250D Sensore livello olio motore\n" +
            "P250E Sensore livello olio motore\n" +
            "P250F Livello olio motore troppo basso\n" +
            "P2510 Monitoraggio relè alimentaz.ECM/PCM\n" +
            "P2511 Monitoraggio relè alimentaz.ECM/PCM\n" +
            "P2512 Richiesta registratore dati eventi\n" +
            "P2513 Richiesta registratore dati eventi\n" +
            "P2514 Richiesta registratore dati eventi\n" +
            "P2515 Sensore B pressione refrigerante A/C\n" +
            "P2516 Sensore B pressione refrigerante A/C\n" +
            "P2517 Sensore B pressione refrigerante A/C\n" +
            "P2518 Sensore B pressione refrigerante A/C\n" +
            "P2519 Circuito A richiesta A/C\n" +
            "P251A Interruttore abilitato PTO\n" +
            "P251B Interruttore abilitato PTO\n" +
            "P251C Interruttore abilitato PTO\n" +
            "P251D Arresto motore PTO - circuito aperto\n" +
            "P251E Arresto motore PTO - segnale basso\n" +
            "P251F Arresto motore PTO - segnale alto\n" +
            "P2520 Richiesta A/C circuito A-segnale basso\n" +
            "P2521 Richiesta A/C circuito A- segnale alto\n" +
            "P2522 Richiesta A/C circuito B\n" +
            "P2523 Richiesta A/C circuito B-segnale basso\n" +
            "P2524 Richiesta A/C circuito B -segnale alto\n" +
            "P2525 Sensore pressione serbatoio vuoto\n" +
            "P2526 Sensore pressione serbatoio vuoto\n" +
            "P2527 Sensore pressione serbatoio vuoto\n" +
            "P2528 Sensore pressione serbatoio vuoto\n" +
            "P2529 Sensore pressione serbatoio vuoto\n" +
            "P252A Sensore qualità olio motore\n" +
            "P252B Sensore qualità olio motore\n" +
            "P252C Sensore qualità olio motore\n" +
            "P252D Sensore qualità olio motore\n" +
            "P252E Sensore qualità olio motore\n" +
            "P252F Livello olio motore troppo alto\n" +
            "P2530 Posiz.funzionamento interr.accensione\n" +
            "P2531 Posiz.funzionamento interr.accensione\n" +
            "P2532 Posiz.funzionamento interr.accensione\n" +
            "P2533 Posiz.Run/Start interrutt.accensione\n" +
            "P2534 Posiz.Run/Start interrutt.accensione\n" +
            "P2535 Posiz.Run/Start interrutt.accensione\n" +
            "P2536 Posizione accessorio interr.iniezione\n" +
            "P2537 Posizione accessorio interr.iniezione\n" +
            "P2538 Posizione accessorio interr.iniezione\n" +
            "P2539 Sensore carburante bassa pressione\n" +
            "P253A Monitoraggio PTO - circuito aperto\n" +
            "P253B Monitoraggio PTO - fuori range\n" +
            "P253C Monitoraggio PTO - segnale basso\n" +
            "P253D Monitoraggio PTO - segnale alto\n" +
            "P253E Monitoraggio PTO-segnale intermittente\n" +
            "P253F Olio motore deteriorato\n" +
            "P2540 Sensore carburante bassa pressione\n" +
            "P2541 Sensore carburante bassa pressione\n" +
            "P2542 Sensore carburante bassa pressione\n" +
            "P2543 Sensore carburante bassa pressione\n" +
            "P2544 Input A richiesta gestione coppia\n" +
            "P2545 Input A richiesta gestione coppia\n" +
            "P2546 Input A richiesta gestione coppia\n" +
            "P2547 Input A richiesta gestione coppia\n" +
            "P2548 Input B richiesta gestione coppia\n" +
            "P2549 Input B richiesta gestione coppia\n" +
            "P254A Sens./interr.1 selettore velocità PTO\n" +
            "P254B Sens./interr.1 selettore velocità PTO\n" +
            "P254C Sens./interr.1 selettore velocità PTO\n" +
            "P254D Sens./interr.1 selettore velocità PTO\n" +
            "P254E Sens./interr.1 selettore velocità PTO\n" +
            "P254F Interr.cofano motore\n" +
            "P2550 Input B richiesta gestione coppia\n" +
            "P2551 Input B richiesta gestione coppia\n" +
            "P2552 Inibizione valv.farfalla/carburante\n" +
            "P2553 Inibizione valv.farfalla/carburante\n" +
            "P2554 Inibizione valv.farfalla/carburante\n" +
            "P2555 Inibizione valv.farfalla/carburante\n" +
            "P2556 Sensore/interr.livello refriger.motore\n" +
            "P2557 Sensore/interr.livello refriger.motore\n" +
            "P2558 Sensore/interr.livello refriger.motore\n" +
            "P2559 Sensore/interr.livello refriger.motore\n" +
            "P255A Sens./interr.2 selettore velocità PTO\n" +
            "P255B Sens./interr.2 selettore velocità PTO\n" +
            "P255C Sens./interr.2 selettore velocità PTO\n" +
            "P255D Sens./interr.2 selettore velocità PTO\n" +
            "P255E Sens./interr.2 selettore velocità PTO\n" +
            "P2560 Livello basso refrigerante motore\n" +
            "P2561 Richiesta illuminazione MIL\n" +
            "P2562 Sens.A pos.controllo turbocompressore\n" +
            "P2563 Sens.A pos.controllo turbocompressore\n" +
            "P2564 Sens.A pos.controllo turbocompressore\n" +
            "P2565 Sens.A pos.controllo turbocompressore\n" +
            "P2566 Sens.A pos.controllo turbocompressore\n" +
            "P2567 Sensore temperatura catalizzatore\n" +
            "P2568 Sensore temperatura catalizzatore\n" +
            "P2569 Sensore temperatura catalizzatore\n" +
            "P256A Sensore/interr.selettore velocità\n" +
            "P256B Sensore/interr.selettore velocità\n" +
            "P256C Sensore/interr.selettore velocità\n" +
            "P256D Sensore/interr.selettore velocità\n" +
            "P256E Sensore/interr.selettore velocità\n" +
            "P2570 Sensore temperatura catalizzatore\n" +
            "P2571 Sensore temperatura catalizzatore\n" +
            "P2572 Sensore deterioramento catalizzatore\n" +
            "P2573 Sensore deterio ramento catalizzatore\n" +
            "P2574 Sensore deterioramento catalizzatore\n" +
            "P2575 Sensore deterioramento catalizzatore\n" +
            "P2576 Sensore deterioramento catalizzatore\n" +
            "P2577 Efficienza catalizzatore\n" +
            "P2578 Sensore velocità turbocompressore\n" +
            "P2579 Sensore velocità turbocompressore\n" +
            "P2580 Sensore velocità turbocompressore\n" +
            "P2581 Sensore velocità turbocompressore\n" +
            "P2582 Sensore velocità turbocompressore\n" +
            "P2583 Sensore distanza ant.cruise control\n" +
            "P2584 Richiesta modulo MIL\n" +
            "P2585 Spia avvertimento\n" +
            "P2586 Sens.B pos.controllo turbocompressore\n" +
            "P2587 Sens.B pos.controllo turbocompressore\n" +
            "P2588 Sens.B pos.controllo turbocompressore\n" +
            "P2589 Sens.B pos.controllo turbocompressore\n" +
            "P2590 Sens.B pos.controllo turbocompressore\n" +
            "P2600 Controllo pompa refrigerante\n" +
            "P2601 Controllo pompa refrigerante\n" +
            "P2602 Controllo pompa refrigerante\n" +
            "P2603 Controllo pompa refrigerante\n" +
            "P2604 Riscaldatore A aria aspirata\n" +
            "P2605 Riscaldatore B aria aspirata\n" +
            "P2606 Riscaldatore B aria aspirata\n" +
            "P2607 Riscaldatore B aria aspirata\n" +
            "P2608 Riscaldatore B aria aspirata\n" +
            "P2609 Prestazione Riscaldatore aria aspirata\n" +
            "P260A Controllo PTO - circuito aperto\n" +
            "P260B Controllo PTO - segnale basso\n" +
            "P260C Controllo PTO - segnale alto\n" +
            "P260D Controllo spia PTO innestato\n" +
            "P260F Processore monitoraggio sist.evap.\n" +
            "P2610 Temporizz.interno spegnimento motore\n" +
            "P2611 Controllo valvola refrigerante A/C\n" +
            "P2612 Controllo valvola refrigerante A/C\n" +
            "P2613 Controllo valvola refrigerante A/C\n" +
            "P2614 Posizione uscita albero a camme\n" +
            "P2615 Posizione uscita albero a camme\n" +
            "P2616 Posizione uscita albero a camme\n" +
            "P2617 Posizione uscita albero a gomito\n" +
            "P2618 Posizione uscita albero a gomito\n" +
            "P2619 Posizione uscita albero a gomito\n" +
            "P2620 Posizione uscita valvola a farfalla\n" +
            "P2621 Posizione uscita valvola a farfalla\n" +
            "P2622 Posizione uscita valvola a farfalla\n" +
            "P2623 Regolatore press.controllo iniettore\n" +
            "P2624 Regolatore press.controllo iniettore\n" +
            "P2625 Regolatore press.controllo iniettore\n" +
            "P2626 Regolazione corrente pos.sonda lambda\n" +
            "P2627 Regolazione corrente pos.sonda lambda\n" +
            "P2628 Regolazione corrente pos.sonda lambda\n" +
            "P2629 Regolazione corrente pos.sonda lambda\n" +
            "P2630 Regolazione corrente pos.sonda lambda\n" +
            "P2631 Regolazione corrente pos.sonda lambda\n" +
            "P2632 Controllo pompa B carburante\n" +
            "P2633 Controllo pompa B carburante\n" +
            "P2634 Controllo pompa B carburante\n" +
            "P2635 Pompa A carburante\n" +
            "P2636 Pompa B carburante\n" +
            "P2637 Segnale A risposta gestione coppia\n" +
            "P2638 Segnale A risposta gestione coppia\n" +
            "P2639 Segnale A risposta gestione coppia\n" +
            "P2640 Segnale A risposta gestione coppia\n" +
            "P2641 Segnale B risposta gestione coppia\n" +
            "P2642 Segnale B risposta gestione coppia\n" +
            "P2643 Segnale B risposta gestione coppia\n" +
            "P2644 Segnale B risposta gestione coppia\n" +
            "P2645 Controllo braccio attuatore A\n" +
            "P2646 Sistema di controllo braccio attuat.A\n" +
            "P2647 Sistema di controllo braccio attuat.A\n" +
            "P2648 Sistema di controllo braccio attuat.A\n" +
            "P2649 Sistema di controllo braccio attuat.A\n" +
            "P264A Sensore posizione braccio attuatore A\n" +
            "P264B Sensore posizione braccio attuatore A\n" +
            "P264C Sensore posizione braccio attuatore A\n" +
            "P264D Sensore posizione braccio attuatore A\n" +
            "P264E Sensore posizione braccio attuatore A\n" +
            "P2650 Controllo braccio attuatore B\n" +
            "P2651 Sistema di controllo braccio attuat.B\n" +
            "P2652 Sistema di controllo braccio attuat.B\n" +
            "P2653 Sistema di controllo braccio attuat.B\n" +
            "P2654 Sistema di controllo braccio attuat.B\n" +
            "P2655 Controllo braccio attuatore A\n" +
            "P2656 Controllo braccio attuatore A\n" +
            "P2657 Controllo braccio attuatore A\n" +
            "P2658 Controllo braccio attuatore A\n" +
            "P2659 Controllo braccio attuatore A\n" +
            "P265A Sensore posizione braccio attuatore B\n" +
            "P265B Sensore posizione braccio attuatore B\n" +
            "P265C Sensore posizione braccio attuatore B\n" +
            "P265D Sensore posizione braccio attuatore B\n" +
            "P265E Sensore posizione braccio attuatore B\n" +
            "P2660 Controllo braccio attuatore B\n" +
            "P2661 Sistema controllo braccio attuatore B\n" +
            "P2662 Sistema controllo braccio attuatore B\n" +
            "P2663 Sistema controllo braccio attuatore B\n" +
            "P2664 Sistema controllo braccio attuatore B\n" +
            "P2665 Controllo interrutt.valv.B carburante\n" +
            "P2666 Controllo interrutt.valv.B carburante\n" +
            "P2667 Controllo interrutt.valv.B carburante\n" +
            "P2668 Controllo spia indicatore carburante\n" +
            "P2669 Tensione attuatore rifornimento\n" +
            "P266A Sensore posizione braccio attuatore A\n" +
            "P266B Sensore posizione braccio attuatore A\n" +
            "P266C Sensore posizione braccio attuatore A\n" +
            "P266D Sensore posizione braccio attuatore A\n" +
            "P266E Sensore posizione braccio attuatore A\n" +
            "P2670 Tensione attuatore rifornimento\n" +
            "P2671 Tensione attuatore rifornimento\n" +
            "P2672 Offset temporizzatore pompa iniezione\n" +
            "P2673 Temporizzatore pompa iniezione\n" +
            "P2674 Temporizzatore pompa iniezione\n" +
            "P2675 Controllo ingresso depuratore aria\n" +
            "P2676 Controllo ingresso depuratore aria\n" +
            "P2677 Controllo ingresso depuratore aria\n" +
            "P2678 Controllo valvola degassamento refrig.\n" +
            "P2679 Controllo valvola degassamento refrig.\n" +
            "P267A Sensore posizione braccio attuatore B\n" +
            "P267B Sensore posizione braccio attuatore B\n" +
            "P267C Sensore posizione braccio attuatore B\n" +
            "P267D Sensore posizione braccio attuatore B\n" +
            "P267E Sensore posizione braccio attuatore B\n" +
            "P2680 Controllo valvola degassamento refrig.\n" +
            "P2681 Controllo esclus.valvola refrig.motore\n" +
            "P2682 Controllo esclus.valvola refrig.motore\n" +
            "P2683 Controllo esclus.valvola refrig.motore\n" +
            "P2684 Tensione attuatore rifornimento\n" +
            "P2685 Tensione attuatore rifornimento\n" +
            "P2686 Tensione attuatore rifornimento\n" +
            "P2700 Tempo applic.elem.A attrito trasm.\n" +
            "P2701 Tempo applic.elem.B attrito trasm.\n" +
            "P2702 Tempo applic.elem.C attrito trasm.\n" +
            "P2703 Tempo applic.elem.D attrito trasm.\n" +
            "P2704 Tempo applic.elem.E attrito trasm.\n" +
            "P2705 Tempo applic.elem.F attrito trasm.\n" +
            "P2706 Spostamento solenoide F\n" +
            "P2707 Spostamento solen.F bloccato spento\n" +
            "P2708 Spostamento solen.F bloccato acceso\n" +
            "P2709 Spostamento solen.F-problema elettrico\n" +
            "P2710 Spostamento solen.F-segnale intremitt.\n" +
            "P2711 Disinserimento Mecc.Inatteso marcia\n" +
            "P2712 Perdita unità di pressione idraulica\n" +
            "P2713 Solenoide D controllo pressione\n" +
            "P2714 Solenoide D controllo pressione\n" +
            "P2715 Solenoide D controllo pressione\n" +
            "P2716 Solenoide D controllo pressione\n" +
            "P2717 Solenoide D controllo pressione\n" +
            "P2718 Controllo solen.D controllo pressione\n" +
            "P2719 Controllo solen.D controllo pressione\n" +
            "P2720 Controllo solen.D controllo pressione\n" +
            "P2721 Controllo solen.D controllo pressione\n" +
            "P2722 Solenoide E controllo pressione\n" +
            "P2723 Solenoide E controllo pressione\n" +
            "P2724 Solenoide E controllo pressione\n" +
            "P2725 Solenoide E controllo pressione\n" +
            "P2726 Solenoide E controllo pressione\n" +
            "P2727 Controllo solen.E controllo pressione\n" +
            "P2728 Controllo solen.E controllo pressione\n" +
            "P2729 Controllo solen.E controllo pressione\n" +
            "P2730 Controllo solen.E controllo pressione\n" +
            "P2731 Solenoide F controllo pressione\n" +
            "P2732 Solenoide F controllo pressione\n" +
            "P2733 Solenoide F controllo pressione\n" +
            "P2734 Solenoide F controllo pressione\n" +
            "P2735 Solenoide F controllo pressione\n" +
            "P2736 Controllo solen.F controllo pressione\n" +
            "P2737 Controllo solen.F controllo pressione\n" +
            "P2738 Controllo solen.F controllo pressione\n" +
            "P2739 Controllo solen.F controllo pressione\n" +
            "P273A Tempo applic.elem.G attrito trasm.\n" +
            "P273B Tempo applic.elem.H attrito trasm.\n" +
            "P2740 Sens.B temperatura fluido trasmissione\n" +
            "P2741 Sens.B temperatura fluido trasmissione\n" +
            "P2742 Sens.B temperatura fluido trasmissione\n" +
            "P2743 Sens.B temperatura fluido trasmissione\n" +
            "P2744 Sens.B temperatura fluido trasmissione\n" +
            "P2745 Sensore B velocità intermedia albero\n" +
            "P2746 Sensore B velocità intermedia albero\n" +
            "P2747 Sensore B velocità intermedia albero\n" +
            "P2748 Sensore B velocità intermedia albero\n" +
            "P2749 Sensore C velocità intermedia albero\n" +
            "P2750 Sensore C velocità intermedia albero\n" +
            "P2751 Sensore C velocità intermedia albero\n" +
            "P2752 Sensore C velocità intermedia albero\n" +
            "P2753 Controllo fluido trasmissione refrig.\n" +
            "P2754 Controllo fluido trasmissione refrig.\n" +
            "P2755 Controllo fluido trasmissione refrig.\n" +
            "P2756 Solen.Press.Frizione Convertit.Coppia\n" +
            "P2757 Solen.Press.Frizione Convertit.Coppia\n" +
            "P2758 Solen.Press.Frizione Convertit.Coppia\n" +
            "P2759 Solen.Press.Frizione Convertit.Coppia\n" +
            "P2760 Solen.Press.Frizione Convertit.Coppia\n" +
            "P2761 Solen.Press.Frizione Convertit.Coppia\n" +
            "P2762 Solen.Press.Frizione Convertit.Coppia\n" +
            "P2763 Solen.Press.Frizione Convertit.Coppia\n" +
            "P2764 Solen.Press.Frizione Convertit.Coppia\n" +
            "P2765 Sensore B velocità input/turbina\n" +
            "P2766 Sensore B velocità input/turbina\n" +
            "P2767 Sensore B velocità input/turbina\n" +
            "P2768 Sensore B velocità input/turbina\n" +
            "P2769 Frizione del convertitore di coppia\n" +
            "P2770 Frizione del convertitore di coppia\n" +
            "P2771 Interruttore 4 ruote motrici\n" +
            "P2772 Interruttore 4 ruote motrici\n" +
            "P2773 Interruttore 4 ruote motrici\n" +
            "P2774 Interruttore 4 ruote motrici\n" +
            "P2775 Interruttore marcia avanti-fuori range\n" +
            "P2776 Interr.marcia avanti - segnale basso\n" +
            "P2777 Interr.marcia avanti - segnale alto\n" +
            "P2778 Interr.marcia avanti-segnale intermit.\n" +
            "P2779 Interr.marcia indietro - fuori range\n" +
            "P2780 Interr.marcia indietro - segnale basso\n" +
            "P2781 Interr.marcia indietro - segnale alto\n" +
            "P2782 Interr.marcia indietro-segn.intermit.\n" +
            "P2783 Temperatura convertitore coppia\n" +
            "P2784 Correlaz.sens.A/B veloc.input/turbina\n" +
            "P2785 Temper.attuatore frizione troppo alta\n" +
            "P2786 Temper.attuatore cambio troppo alta\n" +
            "P2787 Temperatura frizione troppo alta\n" +
            "P2788 Adattamento manuale cambio automatico\n" +
            "P2789 Adattamento frizione al limite\n" +
            "P2790 Direzionamento guida leva cambio\n" +
            "P2791 Direzionamento guida leva cambio\n" +
            "P2792 Direzionamento guida leva cambio\n" +
            "P2793 Direzionamento leva cambio\n" +
            "P2794 Direzionamento leva cambio\n" +
            "P2795 Direzionamento leva cambio\n" +
            "P2796 Controllo Fluido Pompa Trasm.Ausil.\n" +
            "P2797 Prestazione Circuito Fluido Pompa\n" +
            "P2798 Controllo Fluido Pompa Trasm.Ausil.\n" +
            "P2799 Controllo Fluido Pompa Trasm.Ausil.\n" +
            "P2800 Sens.B gamma trasmissione(PRNDL input)\n" +
            "P2801 Sens.B gamma trasmissione - fuori range\n" +
            "P2802 Sens.B gamma trasmissione-input basso\n" +
            "P2803 Sens.B gamma trasmissione - input alto\n" +
            "P2804 Sens.B gamma trasm. - segnale interm.\n" +
            "P2805 Correlazione sens.A/B gamma di trasm.\n" +
            "P2806 Allineamento sens.gamma trasmissione\n" +
            "P2807 Solenoide G controllo pressione\n" +
            "P2808 Solenoide G controllo pressione\n" +
            "P2809 Solenoide G controllo pressione\n" +
            "P2810 Solenoide G controllo pressione\n" +
            "P2811 Solenoide G controllo pressione\n" +
            "P2812 Controllo Solen.G controllo pressione\n" +
            "P2813 Controllo Solen.G controllo pressione\n" +
            "P2814 Controllo Solen.G controllo pressione\n" +
            "P2815 Controllo Solen.G controllo pressione\n" +
            "P2816 Solenoide H controllo pressione\n" +
            "P2817 Solenoide H controllo pressione\n" +
            "P2818 Solenoide H controllo pressione\n" +
            "P2819 Solenoide H controllo pressione\n" +
            "P281A Solenoide H controllo pressione\n" +
            "P281B Controllo Solen.H controllo pressione\n" +
            "P281C Controllo Solen.H controllo pressione\n" +
            "P281D Controllo Solen.H controllo pressione\n" +
            "P281E Controllo Solen.H controllo pressione\n" +
            "P281F Solenoide J controllo pressione\n" +
            "P2820 Solenoide J controllo pressione\n" +
            "P2821 Solenoide J controllo pressione\n" +
            "P2822 Solenoide J controllo pressione\n" +
            "P2823 Solenoide J controllo pressione\n" +
            "P2824 Controllo Solen.J controllo pressione\n" +
            "P2825 Controllo Solen.J controllo pressione\n" +
            "P2826 Controllo Solen.J controllo pressione\n" +
            "P2827 Controllo Solen.J controllo pressione\n" +
            "P2828 Solenoide K controllo pressione\n" +
            "P2829 Solenoide K controllo pressione\n" +
            "P282A Solenoide K controllo pressione\n" +
            "P282B Sole noide K controllo pressione\n" +
            "P282C Solenoide K controllo pressione\n" +
            "P282D Controllo Solen.K controllo pressione\n" +
            "P282E Controllo Solen.K controllo pressione\n" +
            "P282F Controllo Solen.K controllo pressione\n" +
            "P2830 Controllo Solen.K controllo pressione\n" +
            "P2A00 Sonda lambda fuori range\n" +
            "P2A01 Sonda lambda fuori range\n" +
            "P2A02 Sonda lambda fuori range\n" +
            "P2A03 Sonda lambda fuori range\n" +
            "P2A04 Sonda lambda fuori range\n" +
            "P2A05 Sonda lambda fuori range\n" +
            "P2A06 Tensione negativa sonda lambda\n" +
            "P2A07 Tensione negativa sonda lambda\n" +
            "P2A08 Tensione negativa sonda lambda\n" +
            "P2A09 Tensione negativa sonda lambda\n" +
            "P2A10 Tensione negativa sonda lambda\n" +
            "P2A11 Tensione negativa sonda lambda";
    static String P3400P3497 = "P3400 Sistema disattivazione cilindro\n" +
            "P3401 Controllo valv.disattivaz./aspir.cil.1\n" +
            "P3402 Controllo valv.disattivaz./aspir.cil.1\n" +
            "P3403 Controllo valv.disattivaz./aspir.cil.1\n" +
            "P3404 Controllo valv.disattivaz./aspir.cil.1\n" +
            "P3405 Controllo valvola scarico cilindro 1\n" +
            "P3406 Circuito controllo valv.scarico cil.1\n" +
            "P3407 Controllo valvola scarico cilindro 1\n" +
            "P3408 Controllo valvola scarico cilindro 1\n" +
            "P3409 Controllo valv.disattivaz./aspir.cil.2\n" +
            "P3410 Controllo valv.disattivaz./aspir.cil.2\n" +
            "P3411 Controllo valv.disattivaz./aspir.cil.2\n" +
            "P3412 Controllo valv.disattivaz./aspir.cil.2\n" +
            "P3413 Controllo valvola scarico cilindro 2\n" +
            "P3414 Circuito controllo valv.scarico cil.2\n" +
            "P3415 Controllo valvola scarico cilindro 2\n" +
            "P3416 Controllo valvola scarico cilindro 2\n" +
            "P3417 Controllo valv.disattivaz./aspir.cil.3\n" +
            "P3418 Controllo valv.disattivaz./aspir.cil.3\n" +
            "P3419 Controllo valv.disattivaz./aspir.cil.3\n" +
            "P3420 Controllo valv.disattivaz./aspir.cil.3\n" +
            "P3421 Controllo valvola scarico cilindro 3\n" +
            "P3422 Circuito controllo valv.scarico cil.3\n" +
            "P3423 Controllo valvola scarico cilindro 3\n" +
            "P3424 Controllo valvola scarico cilindro 3\n" +
            "P3425 Controllo valv.disattivaz./aspir.cil.4\n" +
            "P3426 Controllo valv.disattivaz./aspir.cil.4\n" +
            "P3427 Controllo valv.disattivaz./aspir.cil.4\n" +
            "P3428 Controllo valv.disattivaz./aspir.cil.4\n" +
            "P3429 Controllo valvola scarico cilindro 4\n" +
            "P3430 Circuito controllo valv.scarico cil.4\n" +
            "P3431 Controllo valvola scarico cilindro 4\n" +
            "P3432 Controllo valvola scarico cilindro 4\n" +
            "P3433 Controllo valv.disattivaz./aspir.cil.5\n" +
            "P3434 Controllo valv.disattivaz./aspir.cil.5\n" +
            "P3435 Controllo valv.disattivaz./aspir.cil.5\n" +
            "P3436 Controllo valv.disattivaz./aspir.cil.5\n" +
            "P3437 Controllo valvola scarico cilindro 5\n" +
            "P3438 Circuito controllo valv.scarico cil.5\n" +
            "P3439 Controllo valvola scarico cilindro 5\n" +
            "P3440 Controllo valvola scarico cilindro 5\n" +
            "P3441 Controllo valv.disattivaz./aspir.cil.6\n" +
            "P3442 Controllo valv.disattivaz./aspir.cil.6\n" +
            "P3443 Controllo valv.disattivaz./aspir.cil.6\n" +
            "P3444 Controllo valv.disattivaz./aspir.cil.6\n" +
            "P3445 Controllo valvola scarico cilindro 6\n" +
            "P3446 Circuito controllo valv.scarico cil.6\n" +
            "P3447 Controllo valvola scarico cilindro 6\n" +
            "P3448 Controllo valvola scarico cilindro 6\n" +
            "P3449 Controllo valv.disattivaz./aspir.cil.7\n" +
            "P3450 Controllo valv.disattivaz./aspir.cil.7\n" +
            "P3451 Controllo valv.disattivaz./aspir.cil.7\n" +
            "P3452 Controllo valv.disattivaz./aspir.cil.7\n" +
            "P3453 Controllo valvola scarico cilindro 7\n" +
            "P3454 Circuito controllo valv.scarico cil.7\n" +
            "P3455 Controllo valvola scarico cilindro 7\n" +
            "P3456 Controllo valvola scarico cilindro 7\n" +
            "P3457 Controllo valv.disattivaz./aspir.cil.8\n" +
            "P3458 Controllo valv.disattivaz./aspir.cil.8\n" +
            "P3459 Controllo valv.disattivaz./aspir.cil.8\n" +
            "P3460 Controllo valv.disattivaz./aspir.cil.8\n" +
            "P3461 Controllo valvola scarico cilindro 8\n" +
            "P3462 Circuito controllo valv.scarico cil.8\n" +
            "P3463 Controllo valvola scarico cilindro 8\n" +
            "P3464 Controllo valvola scarico cilindro 8\n" +
            "P3465 Controllo valv.disattivaz./aspir.cil.9\n" +
            "P3466 Controllo valv.disattivaz./aspir.cil.9\n" +
            "P3467 Controllo valv.disattivaz./aspir.cil.9\n" +
            "P3468 Controllo valv.disattivaz./aspir.cil.9\n" +
            "P3469 Controllo valvola scarico cilindro 9\n" +
            "P3470 Circuito controllo valv.scarico cil.9\n" +
            "P3471 Controllo valvola scarico cilindro 9\n" +
            "P3472 Controllo valvola scarico cilindro 9\n" +
            "P3473 Controllo valv.disattivaz./aspir.cil.10\n" +
            "P3474 Controllo valv.disattivaz./aspir.cil.10\n" +
            "P3475 Controllo valv.disattivaz./aspir.cil.10\n" +
            "P3476 Controllo valv.disattivaz./aspir.cil.10\n" +
            "P3477 Controllo valvola scarico cilindro 10\n" +
            "P3478 Circuito controllo valv.scarico cil.10\n" +
            "P3479 Controllo valvola scarico cilindro 10\n" +
            "P3480 Controllo valvola scarico cilindro 10\n" +
            "P3481 Controllo valv.disattivaz./aspir.cil.11\n" +
            "P3482 Controllo valv.disattivaz./aspir.cil.11\n" +
            "P3483 Controllo valv.disattivaz./aspir.cil.11\n" +
            "P3484 Controllo valv.disattivaz./aspir.cil.11\n" +
            "P3485 Controllo valvola scarico cilindro 11\n" +
            "P3486 Circuito controllo valv.scarico cil.11\n" +
            "P3487 Controllo valvola scarico cilindro 11\n" +
            "P3488 Controllo valvola scarico cilindro 11\n" +
            "P3489 Controllo valv.disattivaz./aspir.cil.12\n" +
            "P3490 Controllo valv.disattivaz./aspir.cil.12\n" +
            "P3491 Controllo valv.disattivaz./aspir.cil.12\n" +
            "P3492 Controllo valv.disattivaz./aspir.cil.12\n" +
            "P3493 Controllo valvola scarico cilindro 12\n" +
            "P3494 Circuito controllo valv.scarico cil.12\n" +
            "P3495 Controllo valvola scarico cilindro 12\n" +
            "P3496 Controllo valvola scarico cilindro 12\n" +
            "P3497 Sistema disattivazione cilindro";
    static String C0000C2767 = "C0000 velocità del veicolo informazioni malfunzionamento circuito\n" +
            "C0035 ruota anteriore sinistra velocità circuito malfunzionamento\n" +
            "C0040 ruota anteriore destra velocità circuito malfunzionamento\n" +
            "C0041 ruota anteriore destra sensore di velocità circuito gamma / prestazioni (EBCM)\n" +
            "C0045 ruota posteriore sinistra velocità circuito malfunzionamento\n" +
            "C0046 ruota posteriore sinistra sensore di velocità circuito gamma / prestazioni (EBCM)\n" +
            "C0050 ruota posteriore destra velocità circuito malfunzionamento\n" +
            "LF C0051 ruota sensore di velocità circuito gamma / prestazioni (EBCM)\n" +
            "C0060 sinistro frontale in ABS solenoide # 1 circuito di malfunzionamento\n" +
            "C0065 sinistro frontale in ABS solenoide # 2 malfunzionamento circuito\n" +
            "C0070 diritto anteriore abs solenoide # 1 circuito di malfunzionamento\n" +
            "C0075 diritto anteriore abs solenoide # 2 malfunzionamento circuito\n" +
            "C0080 posteriore sinistro ABS solenoide # 1 circuito di malfunzionamento\n" +
            "C0085 posteriore sinistro ABS solenoide # 2 malfunzionamento circuito\n" +
            "C0090 posteriore destro ABS solenoide # 1 circuito di malfunzionamento\n" +
            "C0095 posteriore destro ABS solenoide # 2 malfunzionamento circuito\n" +
            "C0110 pompa a motore malfunzionamento circuito\n" +
            "C0121 valvola di collegamento per malfunzionamento del circuito\n" +
            "C0128 basso boschetto fluido circuito basso\n" +
            "C0141 sinistra STC solenoide # 1 circuito di malfunzionamento\n" +
            "C0146 sinistra STC solenoide # 2 malfunzionamento circuito\n" +
            "Destra TCS C0151 solenoide # 1 circuito di malfunzionamento\n" +
            "Destra TCS C0156 solenoide # 2 malfunzionamento circuito\n" +
            "C0161 ABS / TCS freno malfunzionamento interruttore di circuito\n" +
            "C0221 ruota anteriore destra sensore di velocità a circuito aperto\n" +
            "C0222 ruota anteriore destra del segnale di velocità mancante\n" +
            "C0223 ruota anteriore destra del segnale di velocità irregolare\n" +
            "C0225 ruota anteriore sinistra sensore di velocità a circuito aperto\n" +
            "C0226 ruota anteriore sinistra del segnale di velocità mancante\n" +
            "C0227 ruota anteriore sinistra del segnale di velocità irregolare\n" +
            "C0229 calo di velocità ruota anteriore segnali\n" +
            "C0235 ruota posteriore del segnale di velocità a circuito aperto\n" +
            "C0236 ruota posteriore del segnale di velocità circuito mancanti\n" +
            "C0237 ruota posteriore del segnale di velocità irregolare\n" +
            "C0238 ruota velocità disallineamento\n" +
            "C0241 EBCM valvola di controllo del circuito\n" +
            "C0245 sensore di velocità ruota frequenza di errore\n" +
            "C0254 EBCM valvola di controllo del circuito\n" +
            "C0265 EBCM circuito di collegamento\n" +
            "C0266 EBCM circuito di collegamento\n" +
            "C0267 pompa a motore a circuito aperto / corto\n" +
            "C0268 pompa a motore a circuito aperto / corto\n" +
            "C0269 eccessivo dump / isolamento tempo\n" +
            "C0271 EBCM malfunzionamento\n" +
            "C0272 EBCM malfunzionamento\n" +
            "C0273 EBCM malfunzionamento\n" +
            "C0274 eccessivo dump / isolamento tempo\n" +
            "C0279 Powertrain configurazione non valida\n" +
            "C0281 freno interruttore di circuito\n" +
            "C0283 trazione passare in corto a terra\n" +
            "C0284 EBCM malfunzionamento\n" +
            "C0286 ABS indicatore luminoso in corto circuito a B +\n" +
            "C0287 consegnato coppia circuito\n" +
            "C0288 freno avvertimento lampada in corto circuito a B +\n" +
            "C0290 perso le comunicazioni con PCM\n" +
            "C0292 perso le comunicazioni con PCM\n" +
            "C0291 perso le comunicazioni con BCM\n" +
            "C0297 Powertrain dati di configurazione non ha ricevuto\n" +
            "C0298 Powertrain indicato malfunzionamento di controllo di trazione\n" +
            "C0300 posteriore malfunzionamento del sensore di velocità\n" +
            "C0305 fronte malfunzionamento del sensore di velocità\n" +
            "C0306 motore A o B del circuito\n" +
            "C0308 motore A / B circuito basso\n" +
            "C0309 motore A / B circuito ad alta\n" +
            "C0310 motore A / B, circuito aperto\n" +
            "C0315 motore terreno circuito aperto\n" +
            "C0321 caso di trasferimento di blocco del circuito\n" +
            "T-C0323 caso di blocco del circuito basso\n" +
            "T-C0324 caso di blocco del circuito ad alta\n" +
            "C0327 encoder malfunzionamento circuito\n" +
            "C0357 parco interruttore di circuito ad alta\n" +
            "C0359 quattro ruote motrici gamma bassa (4LO) discreto circuito di uscita\n" +
            "C0362 4LO discreto circuito di uscita alta\n" +
            "C0367 asse anteriore circuito di comando ad alta\n" +
            "C0374 generale malfunzionamento del sistema\n" +
            "C0376 anteriore / posteriore albero velocità disallineamento\n" +
            "C0379 asse anteriore del sistema\n" +
            "C0387 in grado di eseguire Shift\n" +
            "C0472 sterzo volantino sensore di velocità V segnale basso\n" +
            "C0473 sterzo volantino segnale del sensore di velocità / Alta\n" +
            "C0495 EVO tracking error\n" +
            "C0498 sterzo attuatore Assistere controllo circuito di alimentazione a bassa\n" +
            "C0499 sterzo assistere controllo solenoide circuito di alimentazione ad alta\n" +
            "C0503 sterzo assistere solenoide di comando di ritorno del circuito a bassa\n" +
            "C0504 sterzo assistere solenoide di comando di ritorno del circuito di alta\n" +
            "Malfunzionamento di ECU C0550 - interno scrivere / checksum malfunzionamento\n" +
            "C0559 EEPROM checksum errore\n" +
            "C0563 taratura ROM checksum errore\n" +
            "C0577 sinistro frontale solenoide circuito basso\n" +
            "C0578 sinistro frontale solenoide circuito ad alta\n" +
            "C0579 sinistro frontale solenoide circuito aperto\n" +
            "C0582 diritto anteriore solenoide circuito basso\n" +
            "C0583 diritto anteriore solenoide circuito ad alta\n" +
            "C0584 diritto anteriore solenoide circuito aperto\n" +
            "C0587 posteriore sinistro solenoide circuito basso\n" +
            "C0588 posteriore sinistro solenoide circuito ad alta\n" +
            "C0589 posteriore sinistro solenoide circuito aperto\n" +
            "C0592 posteriore destro solenoide circuito basso\n" +
            "C0593 posteriore destro solenoide circuito ad alta\n" +
            "C0594 posteriore destro solenoide circuito aperto\n" +
            "C0611 vin informazioni di errore\n" +
            "C0615 sinistro frontale malfunzionamento del sensore di posizione\n" +
            "C0620 diritto anteriore malfunzionamento del sensore di posizione\n" +
            "C0625 posteriore sinistro malfunzionamento del sensore di posizione\n" +
            "C0628 livello di controllo sensore di posizione circuito ad alta\n" +
            "C0630 posteriore destro malfunzionamento del sensore di posizione\n" +
            "C0635 anteriore sinistra normale circuito vigore malfunzionamento\n" +
            "C0638 sinistro frontale vigore normale circuito ad alta\n" +
            "C0640 diritto anteriore normale circuito vigore malfunzionamento\n" +
            "C0643 diritto anteriore vigore normale circuito ad alta\n" +
            "C0655 livello di controllo di collegamento per malfunzionamento del compressore\n" +
            "C0657 livello di controllo compressore circuito basso\n" +
            "C0658 livello di controllo compressore circuito ad alta\n" +
            "C0660 livello di controllo valvola di scarico circuito malfunzionamento\n" +
            "C0662 livello di controllo a circuito valvola di scarico a bassa\n" +
            "C0663 livello di controllo valvola di scarico circuito ad alta\n" +
            "C0665 telaio Piazzola segnale circuito\n" +
            "C0690 smorzatore di controllo di collegamento per malfunzionamento del circuito\n" +
            "C0691 smorzatore di controllo di collegamento circuito Gamma\n" +
            "C0693 smorzatore di controllo di collegamento del circuito di alta\n" +
            "C0695 sensore di posizione di sovracorrente (8 volt fornitura)\n" +
            "C0696 sensore di posizione di sovracorrente (5 volt fornitura)\n" +
            "C0710 timoneria segnale malfunzionamento\n" +
            "C0750 di controllo della pressione pneumatici (TPM) sistema di sensori non trasmettere\n" +
            "C0755 di controllo della pressione pneumatici (TPM) sistema di sensori non trasmettere\n" +
            "C0760 di controllo della pressione pneumatici (TPM) sistema di sensori non trasmettere\n" +
            "C0765 di controllo della pressione pneumatici (TPM) sistema di sensori non trasmettere\n" +
            "C0800 dispositivo potere # 1 circuito di malfunzionamento\n" +
            "C0896 Sospensione di controllo elettronico (CES) di tensione è al di fuori della normale gamma di 9 a 15,5 volt\n" +
            "C1091 sensore di velocità ruota tutti i coerenza Il mancato\n" +
            "C1095 abs pompa idraulica a motore circuito fallimento\n" +
            "C1096 abs pompa idraulica a motore a circuito aperto\n" +
            "C1097 abs pompa idraulica a motore corto circuito a terra\n" +
            "C1098 abs pompa idraulica a motore corto circuito a batteria\n" +
            "C1100 abs pompa interruttore di circuito guasto\n" +
            "C1101 ABS circuito idraulico valvola di fallimento\n" +
            "C1102 ABS accelerazione passare circuito fallimento\n" +
            "C1103 abs freno idraulico interruttore di circuito guasto\n" +
            "C1104 trazione di controllo attivo della lampada - circuito breve di batteria\n" +
            "C1105 disattivare il controllo di trazione lampada - circuito breve di batteria\n" +
            "C1106 disattivare il controllo di trazione interruttore di circuito breve per batteria\n" +
            "C1107 ABS funzione attivata circuito di ingresso fallimento\n" +
            "C1109 di controllo della velocità di montaggio attuatore via cavo mancato rilascio\n" +
            "C1110 ABS relè di potenza bobina circuito fallimento\n" +
            "C1111 ABS bobina relè di potenza a circuito aperto\n" +
            "C1112 ABS bobina relè di potenza di corto circuito a terra\n" +
            "C1113 ABS bobina relè di potenza di corto circuito a batteria\n" +
            "C1114 ABS uscita a relè di potenza di corto circuito a terra\n" +
            "C1115 ABS uscita a relè di potenza di corto circuito a batteria\n" +
            "C1116 motorino di avviamento circuito fallimento\n" +
            "C1117 giri / min circuito di ingresso fallimento\n" +
            "C1123 sensore di velocità del veicolo in ingresso a breve di batteria\n" +
            "C1124 albero di ingresso del segnale di velocità mancanti / colpevolizzata\n" +
            "C1125 livello del liquido dei freni sensore ingresso circuito fallimento\n" +
            "C1126 Cruise Control comando passare Assemblea circuito fallimento\n" +
            "C1127 Cruise Control Deactivator freno passare circuito fallimento\n" +
            "C1132 Frizione posizione ckt breve a terra\n" +
            "C1133 Frizione posizione ckt breve a batteria\n" +
            "C1134 cambio di posizione a breve a terra\n" +
            "C1135 cambio di posizione a breve batteria\n" +
            "C1136 Gear Selezionare posizione a breve a terra\n" +
            "C1137 ECU è difettoso\n" +
            "C1138 Gear Selezionare posizione della batteria breve per\n" +
            "C1139 sensore di velocità ruota centro tono anello mancante dente guasto\n" +
            "C1140 freno idraulico base fallimento\n" +
            "C1141 ruota sensore di velocità LF tono anello mancante dente guasto\n" +
            "C1142 ruota sensore di velocità RF tono anello mancante dente guasto\n" +
            "C1143 ruota sensore di velocità LR tono anello mancante dente guasto\n" +
            "C1144 ruota sensore di velocità RR tono anello mancante dente guasto\n" +
            "C1145 velocità ruota sensore ingresso RF circuito fallimento\n" +
            "C1146 sensore di velocità ruota RF circuito aperto\n" +
            "C1148 sensore di velocità ruota RF coerenza colpa\n" +
            "C1149 fluido idraulico sotto pressione / flusso circuito fallimento\n" +
            "C1150 due velocità asse posteriore ingresso interruttore di circuito a breve Vbatt\n" +
            "C1155 sensore di velocità ruota LF circuito di ingresso fallimento\n" +
            "C1156 sensore di velocità ruota LF circuito aperto\n" +
            "C1157 parco freno Assemblea passare applicato circuito fallimento\n" +
            "C1158 sensore di velocità ruota LF coerenza colpa\n" +
            "C1159 fluido idraulico sotto pressione / flusso corto circuito a GND\n" +
            "C1161 aria a bassa pressione circuito breve per GND\n" +
            "C1162 parco freno passare # 2 rilasciato circuito fallimento\n" +
            "C1163 parco freno passare # 2 applicata al circuito breve GND\n" +
            "C1164 parco freno Assemblea interruttore di circuito guasto\n" +
            "C1165 sensore di velocità ruota RR circuito di ingresso fallimento\n" +
            "C1166 sensore di velocità ruota RR ingresso a circuito aperto\n" +
            "C1167 parco freno Assemblea passare rilasciato a breve circuito GND\n" +
            "C1168 sensore di velocità ruota RR coerenza colpa\n" +
            "C1169 ABS fluido dumping supera massimo tempi\n" +
            "C1170 PRNDL interruttore di circuito guasto\n" +
            "C1172 parco freno passare # 1 applicato circuito fallimento\n" +
            "C1173 parco freno passare # 1 rilasciato a breve circuito GND\n" +
            "C1174 parco freno passare # 2 applicata circuito fallimento\n" +
            "C1175 sensore di velocità ruota LR circuito di ingresso fallimento\n" +
            "C1176 sensore di velocità ruota LR circuito aperto\n" +
            "C1177 parco freno Assemblea passare rilasciato circuito fallimento\n" +
            "C1178 sensore di velocità ruota LR coerenza colpa\n" +
            "C1179 di controllo della velocità di montaggio attuatore via cavo slack fallimento\n" +
            "C1180 parco freno valvola solenoide # 1 senso di ingresso del circuito guasto\n" +
            "C1181 parco freno valvola solenoide # 1 senso di ingresso al circuito breve Gound\n" +
            "C1182 parco lampada flash circuito di collegamento per mancato\n" +
            "C1183 parco lampada flash di collegamento a corto circuito batteria\n" +
            "C1184 abs sistema non è operativo\n" +
            "C1185 ABS uscita a relè di potenza del circuito guasto\n" +
            "C1186 ABS uscita a relè di potenza a circuito aperto\n" +
            "C1187 boschetto fluido livello di ingresso del sensore a circuito aperto\n" +
            "C1188 boschetto fluido livello di ingresso del sensore di corto circuito a batteria\n" +
            "C1189 boschetto fluido livello di ingresso del sensore di corto circuito a terra\n" +
            "C1190 sensore di velocità ruota LF ingresso di corto circuito a batteria\n" +
            "C1191 sensore di velocità ruota LF ingresso di corto circuito a terra\n" +
            "C1192 velocità ruota sensore ingresso RF corto circuito a batteria\n" +
            "C1193 velocità ruota sensore ingresso RF corto circuito a terra\n" +
            "C1194 ABS valvola di sbocco bobina LF circuito fallimento\n" +
            "C1195 ABS valvola di sbocco bobina LF circuito aperto\n" +
            "C1196 ABS valvola di sbocco bobina LF corto circuito a batteria\n" +
            "C1197 ABS valvola di sbocco bobina LF corto circuito a terra\n" +
            "C1198 ABS valvola di aspirazione bobina LF circuito fallimento\n" +
            "C1199 ABS valvola di aspirazione bobina LF circuito aperto\n" +
            "C1200 ABS valvola di aspirazione bobina LF corto circuito a batteria\n" +
            "C1201 ABS valvola di aspirazione bobina LF corto circuito a terra\n" +
            "C1202 ABS valvola di sbocco bobina posteriore circuito fallimento\n" +
            "C1203 ABS valvola di sbocco bobina posteriore circuito aperto\n" +
            "C1204 ABS valvola di sbocco bobina posteriore corto circuito a batteria\n" +
            "C1205 ABS valvola di sbocco bobina posteriore corto circuito a terra\n" +
            "C1206 ABS valvola di aspirazione bobina posteriore circuito fallimento\n" +
            "C1207 ABS valvola di aspirazione bobina posteriore circuito aperto\n" +
            "C1208 ABS valvola di aspirazione bobina posteriore corto circuito a batteria\n" +
            "C1209 ABS valvola di aspirazione bobina posteriore corto circuito a terra\n" +
            "C1210 ABS valvola di sbocco bobina RF circuito fallimento\n" +
            "C1211 ABS valvola di sbocco bobina RF circuito aperto\n" +
            "C1212 ABS valvola di sbocco bobina RF corto circuito a batteria\n" +
            "C1213 ABS valvola di sbocco bobina RF corto circuito a terra\n" +
            "C1214 ABS valvola di aspirazione bobina RF circuito fallimento\n" +
            "C1215 ABS valvola di aspirazione bobina RF circuito aperto\n" +
            "C1216 ABS valvola di aspirazione bobina RF corto circuito a batteria\n" +
            "C1217 ABS valvola di aspirazione bobina RF corto circuito a terra\n" +
            "C1218 lampada ABS avviso di uscita del circuito guasto\n" +
            "C1219 lampada ABS avviso di uscita circuito aperto\n" +
            "C1220 lampada ABS avviso corto circuito di uscita a batteria\n" +
            "C1221 lampada ABS avviso corto circuito di uscita a terra\n" +
            "C1222 velocità ruota disallineamento\n" +
            "C1223 lampada freno avviso di uscita del circuito guasto\n" +
            "C1224 lampada freno avviso di uscita circuito aperto\n" +
            "C1225 lampada freno avviso corto circuito di uscita a batteria\n" +
            "C1226 lampada freno avviso corto circuito di uscita a terra\n" +
            "C1227 sensore di velocità ruota LR ingresso di corto circuito a batteria\n" +
            "C1228 sensore di velocità ruota LR ingresso di corto circuito a terra\n" +
            "C1229 sensore di velocità ruota posteriore centro coerenza colpa\n" +
            "C1230 sensore di velocità ruota posteriore centro circuito di ingresso fallimento\n" +
            "C1231 sensore di velocità ruota posteriore centro circuito aperto\n" +
            "C1232 sensore di velocità ruota posteriore centro ingresso di corto circuito a batteria\n" +
            "C1233 velocità ruota LF segnale di ingresso mancanti\n" +
            "C1234 velocità ruota il segnale di ingresso, RF mancanti\n" +
            "C1235 velocità ruota RR segnale di ingresso mancanti\n" +
            "C1236 velocità ruota LR segnale di ingresso mancanti\n" +
            "C1237 velocità ruota posteriore segnale di ingresso mancanti\n" +
            "C1238 ABS differenziale di pressione idraulica di ingresso del circuito passare fallimento\n" +
            "C1239 ABS pressione idraulica interruttore differenziale di ingresso a circuito aperto\n" +
            "C1240 ABS pressione idraulica interruttore differenziale ingresso di corto circuito a batteria\n" +
            "C1241 ABS pressione idraulica interruttore differenziale ingresso di corto circuito a terra\n" +
            "C1242 ABS valvola di sbocco bobina LR circuito fallimento\n" +
            "C1243 ABS valvola di sbocco bobina LR circuito aperto\n" +
            "C1244 ABS valvola di sbocco bobina LR corto circuito a batteria\n" +
            "C1245 ABS valvola di sbocco bobina LR corto circuito a terra\n" +
            "C1246 ABS valvola di sbocco bobina RR circuito fallimento\n" +
            "C1247 ABS valvola di sbocco bobina RR circuito aperto\n" +
            "C1248 ABS valvola di sbocco bobina RR corto circuito a batteria\n" +
            "C1249 ABS valvola di sbocco bobina RR corto circuito a terra\n" +
            "C1250 ABS valvola di aspirazione bobina LR circuito fallimento\n" +
            "C1251 ABS valvola di aspirazione bobina LR circuito aperto\n" +
            "C1252 ABS valvola di aspirazione bobina LR corto circuito a batteria\n" +
            "C1253 ABS valvola di aspirazione bobina LR corto circuito a terra\n" +
            "C1254 ABS valvola di aspirazione bobina RR circuito fallimento\n" +
            "C1255 ABS valvola di aspirazione bobina RR circuito aperto\n" +
            "C1256 ABS valvola di aspirazione bobina RR corto circuito a batteria\n" +
            "C1257 ABS valvola di aspirazione bobina RR corto circuito a terra\n" +
            "C1258 velocità ruota LF confronto fallimento\n" +
            "C1259 velocità ruota RF confronto fallimento\n" +
            "C1260 velocità ruota RR confronto fallimento\n" +
            "C1261 velocità ruota LR confronto fallimento\n" +
            "C1262 lampada di collegamento circuito Avvertimento fallimento\n" +
            "C1263 lampada di avvertimento di collegamento circuito aperto\n" +
            "C1264 lampada di avvertimento di collegamento a corto circuito batteria\n" +
            "C1265 lampada di avvertimento corto circuito di collegamento a terra\n" +
            "C1266 ABS valvola di collegamento del circuito di potenza fallimento\n" +
            "C1267 ABS funzioni disabilitato temporaneamente\n" +
            "C1268 motore Relay # 1 circuito di guasto\n" +
            "C1269 Motor Relay # 1 corto circuito a batteria\n" +
            "C1270 motore # 1 circuito di ingresso fallimento\n" +
            "C1271 Motor # 1 circuito di ingresso a breve di Gnd\n" +
            "C1272 motore # 2 Circuito di ingresso fallimento\n" +
            "C1273 Motor # 2 Input Circuito corto di Vbat\n" +
            "C1274 solenoide Relay # 1 circuito di guasto\n" +
            "C1275 Solenoide Relay # 1 corto circuito a Vbatt\n" +
            "C1276 parco freno Assemblea passare applicata al circuito breve GND\n" +
            "C1277 volante angolo 1 e 2 del circuito guasto\n" +
            "C1278 volante angolo 1 e 2 del segnale colpevolizzata\n" +
            "C1279 sensore di velocità d'imbardata circuito fallimento\n" +
            "C1280 sensore di velocità d'imbardata segnale di guasto\n" +
            "C1281 laterale accelerometro circuito fallimento\n" +
            "C1282 laterale accelerometro segnale di guasto\n" +
            "C1283 passare segnale di prova fallimento\n" +
            "C1284 pressione olio passare fallimento\n" +
            "C1285 Booster solenoide circuito fallimento\n" +
            "C1286 Booster guasto meccanico\n" +
            "C1287 pedale booster vigore interruttore di circuito guasto\n" +
            "C1288 trasduttore di pressione principale / primario di ingresso del circuito guasto\n" +
            "C1289 trasduttore di pressione ridondante / ingresso secondario circuito fallimento\n" +
            "C1400 valvola di controllo di trazione RF circuito fallimento\n" +
            "C1401 valvola di controllo di trazione RF circuito aperto\n" +
            "C1402 valvola di controllo di trazione RF corto circuito a terra\n" +
            "C1403 valvola di controllo di trazione RF corto circuito a batteria\n" +
            "C1404 valvola di controllo di trazione posteriore circuito fallimento\n" +
            "C1405 trazione posteriore valvola di controllo a circuito aperto\n" +
            "C1406 valvola di controllo di trazione posteriore corto circuito a terra\n" +
            "C1407 valvola di controllo di trazione posteriore corto circuito a batteria\n" +
            "C1410 valvola di controllo di trazione LF circuito fallimento\n" +
            "C1411 valvola di controllo di trazione LF circuito aperto\n" +
            "C1412 valvola di controllo di trazione LF corto circuito a terra\n" +
            "C1413 valvola di controllo di trazione LF corto circuito a batteria\n" +
            "C1414 modulo errato livello di progettazione\n" +
            "C1415 errata configurazione del modulo\n" +
            "C1416 serranda RF corto circuito a batteria\n" +
            "C1417 serranda RF corto circuito a terra\n" +
            "C1418 serranda RF circuito fallimento\n" +
            "C1419 serranda RF circuito aperto\n" +
            "C1420 fluido idraulico sotto pressione / flusso corto circuito a Vbatt\n" +
            "C1421 serranda LF circuito breve di batteria\n" +
            "C1422 serranda LF circuito breve al suolo\n" +
            "C1423 serranda LF circuito fallimento\n" +
            "C1424 serranda LF circuito aperto\n" +
            "C1425 serranda RR corto circuito a terra\n" +
            "C1426 serranda RR corto circuito a batteria\n" +
            "C1427 serranda RR circuito aperto\n" +
            "C1428 serranda RR circuito fallimento\n" +
            "Ingresso C1429-asta-velocità in ingresso del circuito guasto\n" +
            "C1430 serranda LR circuito aperto\n" +
            "C1431 serranda LR corto circuito a batteria\n" +
            "C1432 serranda LR corto circuito a terra\n" +
            "C1433 serranda LR circuito fallimento\n" +
            "C1435 accelerometro posteriore circuito fallimento\n" +
            "C1436 accelerometro posteriore circuito del segnale non è avvertito\n" +
            "C1437 accelerometro posteriore corto circuito a terra\n" +
            "C1438 accelerometro posteriore corto circuito a batteria\n" +
            "C1439 veicolo accelerazione CEE-IV circuito fallimento\n" +
            "C1440 trasduttore di pressione principale / primario segnale colpevolizzata\n" +
            "C1441 sterzo fase Un circuito del segnale non è avvertito\n" +
            "C1442 sterzo fase B del circuito del segnale non è avvertito\n" +
            "C1443 sterzo Fase A corto circuito a terra\n" +
            "C1444 sterzo fase B corto circuito a terra\n" +
            "C1445 segnale velocità veicolo guasto circuito\n" +
            "C1446 freno interruttore di circuito guasto\n" +
            "C1447 modulo di controllo di trazione richiesta circuito fallimento\n" +
            "C1448 lampada Adaptive Damping avvertimento circuito fallimento\n" +
            "C1449 controllo di trazione a motore coerenza colpa\n" +
            "C1450 controllo di trazione a motore circuito fallimento\n" +
            "C1451 controllo di trazione a motore a circuito aperto\n" +
            "C1452 controllo di trazione a motore corto circuito a batteria\n" +
            "C1453 controllo di trazione a motore corto circuito a terra\n" +
            "C1454 anteriore laterale accelerometro circuito fallimento\n" +
            "C1455 accelerometro fronte circuito fallimento\n" +
            "C1456 accelerometro fronte circuito non è avvertito\n" +
            "C1457 accelerometro fronte circuito breve al suolo\n" +
            "C1458 accelerometro davanti a corto circuito batteria\n" +
            "C1459 modalità Adaptive circuito fallimento\n" +
            "C1460 veicolo accelerometro potere circuito fallimento\n" +
            "C1461 veicolo accelerometro circuito di alimentazione a batteria breve\n" +
            "C1462 verticale anteriore sinistra accelerometro circuito fallimento\n" +
            "C1463 diritto anteriore verticale accelerometro circuito fallimento\n" +
            "C1464 trasduttore di pressione ridondante / secondario segnale colpevolizzata\n" +
            "C1465 ammortizzatore anteriore lato alto a corto circuito a batteria\n" +
            "C1466 serranda circuito fallimento\n" +
            "C1467 ammortizzatore posteriore alta lato corto circuito a batteria\n" +
            "C1468 ammortizzatore lato anteriore Min circuito fallimento\n" +
            "C1469 ammortizzatore posteriore lato basso del circuito guasto\n" +
            "C1495 controllo di trazione a motore potenziometro circuito fallimento\n" +
            "C1496 controllo di trazione a motore potenziometro circuito aperto\n" +
            "C1497 controllo di trazione a motore potenziometro corto circuito a batteria\n" +
            "C1498 controllo di trazione a motore potenziometro corto circuito a terra\n" +
            "C1499 caso di trasferimento di contatto targa \"A\" encoder circuito fallimento\n" +
            "C1500 caso di trasferimento di contatto targa \"B\" encoder circuito fallimento\n" +
            "C1501 caso di trasferimento di contatto piastra a \"C\" encoder circuito fallimento\n" +
            "C1502 caso di trasferimento di contatto targa \"D\" encoder circuito fallimento\n" +
            "C1503 controllo dinamico della stabilità anteriore sinistra malfunzionamento della valvola\n" +
            "C1504 controllo dinamico della stabilità anteriore destro malfunzionamento della valvola\n" +
            "C1505 controllo dinamico della stabilità posteriore sinistro malfunzionamento della valvola\n" +
            "C1506 controllo dinamico della stabilità posteriore destro malfunzionamento della valvola\n" +
            "C1507 controllo di trazione superiore a freno Time-out\n" +
            "C1508 controllo di trazione del motore supera i time-out\n" +
            "C1510 ruota anteriore destra riduzione della pressione prestazioni problema\n" +
            "C1511 ruota anteriore sinistra riduzione della pressione prestazioni problema\n" +
            "C1512 ruota posteriore destra riduzione della pressione prestazioni problema\n" +
            "C1513 ruota posteriore sinistra riduzione della pressione prestazioni problema\n" +
            "C1699 posteriore sinistro sensore a corto circuito Vbat\n" +
            "C1700 posteriore sinistro circuito sensore fallimento\n" +
            "C1701 posteriore sinistro sensore circuito di guasto\n" +
            "C1702 RightRear sensore corto circuito a Vbat\n" +
            "C1703 posteriore destro circuito sensore fallimento\n" +
            "C1704 destra posteriore del circuito di guasto del sensore\n" +
            "C1705 centro sinistra posteriore corto circuito del sensore di Vbat\n" +
            "C1706 posteriore sinistra centro circuito sensore fallimento\n" +
            "C1707 centro sinistra posteriore del circuito di guasto del sensore\n" +
            "C1708 centro destra posteriore corto circuito del sensore di Vbat\n" +
            "C1709 centro destra posteriore sensore circuito fallimento\n" +
            "C1710 centro destra posteriore del circuito di guasto del sensore\n" +
            "C1711 sinistro frontale sensore corto circuito a Vbat\n" +
            "C1712 sinistro frontale sensore circuito fallimento\n" +
            "C1713 sinistro frontale sensore circuito di guasto\n" +
            "C1714 diritto anteriore corto circuito del sensore di Vbat\n" +
            "C1715 diritto anteriore del sensore circuito fallimento\n" +
            "C1716 diritto anteriore del sensore del circuito di guasto\n" +
            "C1717 centro sinistra anteriore del sensore corto circuito a Vbat\n" +
            "C1718 centro sinistra anteriore del sensore circuito fallimento\n" +
            "C1719 centro sinistra anteriore del sensore del circuito di guasto\n" +
            "C1721 sospensione pneumatica altezza sensore di potenza circuito aperto\n" +
            "C1722 sospensione pneumatica altezza sensore di potenza di corto circuito batteria\n" +
            "C1723 sospensione pneumatica altezza sensore di potenza di corto circuito di terra\n" +
            "C1724 sospensione pneumatica altezza sensore di potenza del circuito guasto\n" +
            "C1725 sospensione pneumatica pneumatico anteriore fallimento\n" +
            "C1726 aria sospensione posteriore pneumatica fallimento\n" +
            "C1727 aria sospensione pneumatica insuccesso Reservoir\n" +
            "C1728 caso di trasferimento in grado di transizione tra 2H e 4H\n" +
            "C1729 caso di trasferimento in grado di transizione tra 4H e 4L\n" +
            "C1730 Codice di tensione fuori range (+5 V)\n" +
            "C1731 sospensione pneumatica LF angolo fino timeout\n" +
            "C1732 sospensione pneumatica LF angolo Down timeout\n" +
            "C1733 sospensione pneumatica RF angolo fino timeout\n" +
            "C1734 sospensione pneumatica RF angolo Down timeout\n" +
            "C1735 sospensione pneumatica LR angolo fino timeout\n" +
            "C1736 sospensione pneumatica LR angolo Down timeout\n" +
            "C1737 sospensione pneumatica RR angolo fino timeout\n" +
            "C1738 sospensione pneumatica RR angolo Down timeout\n" +
            "C1739 diritto anteriore centrale del sensore corto circuito a Vbat\n" +
            "C1740 diritto anteriore centrale del sensore circuito fallimento\n" +
            "C1741 diritto anteriore centrale del sensore del circuito di guasto\n" +
            "C1742 posteriore solida circuito fallimento\n" +
            "C1743 posteriore solida circuito breve per Vbatt\n" +
            "C1744 fronte Sounder circuito fallimento\n" +
            "C1745 solida davanti a circuito breve Vbatt\n" +
            "C1748 interruttore di circuito di ingresso a breve GND\n" +
            "C1749 rimorchio circuito di ingresso fallimento\n" +
            "C1750 acceleratore sensore di posizione di gamma\n" +
            "C1751 sensore di velocità del veicolo # 1 uscita a breve circuito Vbatt\n" +
            "C1752 sensore di velocità del veicolo # 1 uscita a breve circuito GND\n" +
            "C1753 frizione attuatore idraulico valvola segnale di guasto\n" +
            "C1754 frizione attuatore idraulico valvola circuito fallimento\n" +
            "C1755 limite di potenza di arresto colpa\n" +
            "C1756 aria sospensione anteriore sensore di altezza elevata (SE), segnale circuito fallimento\n" +
            "C1757 aria sospensione anteriore sensore di altezza elevata (SE), segnale circuito aperto\n" +
            "C1758 aria sospensione anteriore sensore di altezza elevata (SE) segnale di corto circuito a batteria\n" +
            "C1759 aria sospensione anteriore sensore di altezza elevata (SE) segnale di corto circuito a terra\n" +
            "C1760 aria sospensione posteriore sensore di altezza elevata (SE), segnale circuito fallimento\n" +
            "C1761 aria sospensione posteriore sensore di altezza elevata (SE), segnale circuito aperto\n" +
            "C1762 aria sospensione posteriore sensore di altezza elevata (SE) segnale di corto circuito a batteria\n" +
            "C1763 aria sospensione posteriore sensore di altezza elevata (SE) segnale di corto circuito a terra\n" +
            "C1765 aria sospensione posteriore altezza sensore basso segnale circuito fallimento\n" +
            "C1766 aria sospensione posteriore altezza sensore basso segnale circuito aperto\n" +
            "C1767 aria sospensione posteriore bassa altezza sensore corto circuito segnale di batteria\n" +
            "C1768 aria sospensione posteriore bassa altezza sensore corto circuito segnale a terra\n" +
            "C1770 sospensione pneumatica bocca di uscita del circuito solenoide fallimento\n" +
            "C1771 sospensione pneumatica solenoide bocca di uscita del circuito aperto\n" +
            "C1772 sospensione pneumatica bocca solenoide corto circuito di uscita a batteria\n" +
            "C1773 sospensione pneumatica bocca solenoide corto circuito di uscita a terra\n" +
            "C1774 temperatura liquido di raffreddamento di serie\n" +
            "C1775 DC-DC Converter fallimento\n" +
            "C1776 guasto del sistema di riscaldamento\n" +
            "C1777 vuoto pressione circuito fallimento\n" +
            "C1778 potere direttivo fallimento\n" +
            "C1779 soffiatore passare fallimento\n" +
            "C1780 temperatura selezionare fallimento\n" +
            "C1781 temperatura liquido di raffreddamento del motore segnale mancante / colpa\n" +
            "C1790 sospensione pneumatica LR aria di primavera / shock solenoide circuito di uscita fallimento\n" +
            "C1791 sospensione pneumatica LR aria di primavera / shock solenoide uscita circuito aperto\n" +
            "C1792 sospensione pneumatica LR aria di primavera / shock solenoide corto circuito di uscita a batteria\n" +
            "C1793 sospensione pneumatica LR aria di primavera / shock solenoide corto circuito di uscita a terra\n" +
            "C1795 sospensione pneumatica RR aria di primavera / shock solenoide circuito di uscita fallimento\n" +
            "C1796 sospensione pneumatica RR aria di primavera / shock solenoide uscita circuito aperto\n" +
            "C1797 sospensione pneumatica RR aria di primavera / shock solenoide corto circuito di uscita a batteria\n" +
            "C1798 sospensione pneumatica RR aria di primavera / shock solenoide corto circuito di uscita a terra\n" +
            "C1800 sospensione pneumatica serbatoio solenoide circuito fallimento\n" +
            "C1805 PCM inadeguato e / o ABS-TC Modulo\n" +
            "C1813 sospensione pneumatica LR bocca richiesta superato calendario max\n" +
            "C1814 sospensione pneumatica RR bocca richiesta superato calendario max\n" +
            "C1818 sospensione pneumatica LR comprimere aria richiesta superato calendario max\n" +
            "C1819 sospensione pneumatica RR comprimere aria richiesta superato calendario max\n" +
            "C1820 sospensione pneumatica RF comprimere aria richiesta superato calendario max\n" +
            "C1830 compressore aria sospensione di collegamento del circuito guasto\n" +
            "C1831 sospensione pneumatica compressore relè circuito aperto\n" +
            "C1832 sospensione pneumatica compressore relè per circuito breve batteria\n" +
            "C1833 sospensione pneumatica compressore circuito breve di collegamento a terra\n" +
            "C1834 misuratore di unità corrente di guasto\n" +
            "C1835 attuale senso circuito fallimento\n" +
            "C1836 Batteria di Temp Range\n" +
            "C1837 batteria fallimento del circuito riscaldamento\n" +
            "C1838 sistema di tariffazione colpa\n" +
            "C1839 colpa delle perdite\n" +
            "C1840 sospensione pneumatica disattivare interruttore di circuito guasto\n" +
            "C1841 sospensione pneumatica disattivare interruttore di circuito aperto\n" +
            "C1842 sospensione pneumatica disattivare interruttore di circuito breve per batteria\n" +
            "C1843 sospensione pneumatica disattivare interruttore di circuito breve al suolo\n" +
            "C1844 aria secondaria sospensione anteriore di inflazione solenoide circuito di uscita fallimento\n" +
            "C1845 aria sospensione anteriore di inflazione solenoide circuito di uscita fallimento\n" +
            "C1846 aria sospensione anteriore di inflazione solenoide uscita circuito aperto\n" +
            "C1847 aria sospensione anteriore di inflazione solenoide corto circuito di uscita a batteria\n" +
            "C1848 aria sospensione anteriore di inflazione solenoide corto circuito di uscita a terra\n" +
            "C1849 pompa pressione di gamma\n" +
            "C1850 sospensione pneumatica avvertimento Guasto del circuito della lampada\n" +
            "C1851 aria di avvertimento lampada sospensione circuito aperto\n" +
            "C1852 sospensione pneumatica avviso corto circuito lampada a batteria\n" +
            "C1853 sospensione pneumatica avviso corto circuito lampada a terra\n" +
            "C1854 temperatura motore di serie\n" +
            "C1855 accelerazione sensore di posizione di conflitto\n" +
            "C1856 trazione a motore encoder circuito fallimento\n" +
            "C1859 PRNDL ingresso # 2 circuito di guasto\n" +
            "C1860 PRNDL ingresso # 3 circuito fallimento\n" +
            "C1861 PRNDL ingresso # 4 circuito fallimento\n" +
            "C1862 contattore circuito fallimento\n" +
            "C1863 colpa di ricarica esterna\n" +
            "C1864 modulo batteria colpa\n" +
            "C1865 aria sospensione posteriore di inflazione solenoide circuito di uscita fallimento\n" +
            "C1866 aria sospensione posteriore di inflazione solenoide uscita circuito aperto\n" +
            "C1867 aria sospensione posteriore di inflazione solenoide corto circuito di uscita a batteria\n" +
            "C1868 aria sospensione posteriore di inflazione solenoide corto circuito di uscita a terra\n" +
            "C1869 sospensione pneumatica cancello di uscita del circuito solenoide fallimento\n" +
            "C1870 sospensione pneumatica solenoide cancello di uscita del circuito aperto\n" +
            "C1871 sospensione pneumatica solenoide cancello di uscita del circuito a breve batteria\n" +
            "C1872 sospensione pneumatica cancello solenoide corto circuito di uscita a terra\n" +
            "C1873 sospensione pneumatica RF aria di primavera solenoide circuito di uscita fallimento\n" +
            "C1874 sospensione pneumatica RF aria di primavera solenoide uscita circuito aperto\n" +
            "C1875 sospensione pneumatica RF aria di primavera solenoide corto circuito di uscita a batteria\n" +
            "C1876 sospensione pneumatica RF aria di primavera solenoide corto circuito di uscita a terra\n" +
            "C1877 sospensione pneumatica LF aria di primavera solenoide circuito di uscita fallimento\n" +
            "C1878 sospensione pneumatica LF aria di primavera solenoide uscita circuito aperto\n" +
            "C1879 sospensione pneumatica LF aria di primavera solenoide corto circuito di uscita a batteria\n" +
            "C1880 sospensione pneumatica LF aria di primavera solenoide corto circuito di uscita a terra\n" +
            "C1881 sospensione pneumatica RF altezza sensore circuito fallimento\n" +
            "C1882 sospensione pneumatica RF altezza sensore circuito aperto\n" +
            "C1883 sospensione pneumatica RF altezza sensore corto circuito a batteria\n" +
            "C1884 sospensione pneumatica RF altezza sensore corto circuito a terra\n" +
            "C1885 sospensione pneumatica RR altezza sensore circuito fallimento\n" +
            "C1886 sospensione pneumatica RR altezza sensore circuito aperto\n" +
            "C1887 sospensione pneumatica RR altezza sensore corto circuito a batteria\n" +
            "C1888 sospensione pneumatica RR altezza sensore corto circuito a terra\n" +
            "C1889 sospensione pneumatica LF altezza sensore circuito fallimento\n" +
            "C1890 sospensione pneumatica LF altezza sensore circuito aperto\n" +
            "C1891 sospensione pneumatica LF altezza sensore corto circuito a batteria\n" +
            "C1892 sospensione pneumatica LF altezza sensore corto circuito a terra\n" +
            "C1893 sospensione pneumatica LR altezza sensore circuito fallimento\n" +
            "C1894 sospensione pneumatica LR altezza sensore circuito aperto\n" +
            "C1895 sospensione pneumatica LR altezza sensore corto circuito a batteria\n" +
            "C1896 sospensione pneumatica LR altezza sensore corto circuito a terra\n" +
            "C1897 sterzo VAPS II circuito loop fallimento\n" +
            "C1898 sterzo VAPS II circuito a circuito aperto\n" +
            "C1899 sterzo VAPS II circuito breve loop di batteria\n" +
            "C1900 sterzo VAPS II circuito corto circuito a terra\n" +
            "C1901 Ride controllo RR shock attuatore circuito fallimento\n" +
            "C1902 Ride controllo RR shock attuatore circuito aperto\n" +
            "C1903 Ride controllo RR shock attuatore circuito breve di batteria\n" +
            "C1904 Ride controllo RR shock attuatore circuito breve al suolo\n" +
            "C1905 Ride controllo LR shock attuatore circuito fallimento\n" +
            "C1906 Ride controllo LR shock attuatore circuito aperto\n" +
            "C1907 Ride controllo LR shock attuatore circuito breve di batteria\n" +
            "C1908 Ride controllo LR shock attuatore circuito breve al suolo\n" +
            "C1909 Ride controllo RF shock attuatore circuito fallimento\n" +
            "C1910 Ride controllo RF shock attuatore circuito aperto\n" +
            "C1911 Ride controllo RF shock attuatore circuito breve di batteria\n" +
            "C1912 Ride controllo RF shock attuatore circuito breve al suolo\n" +
            "C1913 Ride controllo LF shock attuatore circuito fallimento\n" +
            "C1914 Ride controllo LF shock attuatore circuito aperto\n" +
            "C1915 Ride controllo LF shock attuatore circuito breve di batteria\n" +
            "C1916 Ride controllo LF shock attuatore circuito breve al suolo\n" +
            "C1917 direttivo EVO out-of-Range Fault\n" +
            "C1918 sospensione pneumatica Ride altezza selezionare interruttore di circuito guasto\n" +
            "C1920 Led # 1 Circuito di mancata\n" +
            "C1921 VAPS solenoide attuatore circuito di uscita fallimento\n" +
            "C1922 VAPS solenoide attuatore uscita circuito aperto\n" +
            "C1923 VAPS solenoide attuatore corto circuito di uscita a batteria\n" +
            "C1924 VAPS solenoide attuatore corto circuito di uscita a terra\n" +
            "C1925 VAPS solenoide attuatore mancato ritorno del circuito\n" +
            "C1926 VAPS solenoide attuatore ritorno circuito aperto\n" +
            "C1927 VAPS solenoide attuatore ritorno a breve circuito batteria\n" +
            "C1928 VAPS solenoide attuatore circuito breve ritorno a terra\n" +
            "C1929 aria sospensione anteriore compressore circuito di collegamento per mancato\n" +
            "C1930 aria sospensione anteriore compressore relè circuito aperto\n" +
            "C1931 aria sospensione anteriore compressore relè per circuito breve batteria\n" +
            "C1932 aria compressore sospensione anteriore corto circuito di collegamento a terra\n" +
            "C1933 solenoide attuale gamma di\n" +
            "C1934 HPU (pompa idraulica unità) pressurizzazione fallimento\n" +
            "Din-don C1935 circuito fallimento\n" +
            "C1936 pompa idraulica di collegamento del circuito guasto\n" +
            "C1937 volante sensore angolo di compensare il mancato\n" +
            "C1938 non valido volante sensore angolo id\n" +
            "C1939 freno pressione interruttore di circuito di ingresso fallimento\n" +
            "C1940 freno pressione interruttore meccanico fallimento\n" +
            "C1942 Powertrain configurazione non riconosciuto\n" +
            "C1943 airbag spiegamento indicazione ingresso colpa\n" +
            "C1944 manometro circuito di pilotaggio colpa\n" +
            "C1945 parco parametro indica parco con veicolo in movimento\n" +
            "C1946 sede traccia posizione interruttore di circuito aperto\n" +
            "C1947 sede traccia posizione interruttore di circuito breve al suolo\n" +
            "C1948 sede traccia posizione interruttore di circuito di resistenza di serie\n" +
            "C1949 accelerometro sensore circuito aperto\n" +
            "C1950 accelerometro sensore circuito fallimento\n" +
            "C1951 laterale accelerometro sensore circuito aperto\n" +
            "C1952 sensore di velocità d'imbardata circuito aperto\n" +
            "C1953 pompa sensore di pressione del circuito aperto\n" +
            "C1954 pompa sensore di pressione del circuito guasto\n" +
            "C1955 sensore angolo sterzo circuito aperto\n" +
            "C1956 sensore angolo sterzo circuito fallimento\n" +
            "C1957 stabilità dinamica valvola di controllo a circuito RF fallimento\n" +
            "C1958 controllo dinamico della stabilità LF circuito valvola di fallimento\n" +
            "C1959 laterale accelerometro sensore circuito fallimento\n" +
            "C1960 driver freno applicare circuito di guasto\n" +
            "C1961 parco lampada relè bobina circuito fallimento\n" +
            "C1962 parco lampada di collegamento bobina a breve batteria\n" +
            "C1963 di controllo di stabilità inibire avvertimento\n" +
            "C2767 riservati - TBD";
    static String B1200B1699 = "B1200 clima di controllo circuito pulsante mancato\n" +
            "B1201 combustibile mittente circuito fallimento\n" +
            "B1202 combustibile mittente circuito aperto\n" +
            "B1203 combustibile mittente corto circuito a batteria\n" +
            "B1204 combustibile mittente corto circuito a terra\n" +
            "B1205 EIC-Interruttore 1 Assemblea circuito fallimento\n" +
            "B1206 EIC-Interruttore 1 Assemblea circuito aperto\n" +
            "B1207 EIC-Interruttore 1 Assemblea circuito breve di batteria\n" +
            "B1208 EIC-Interruttore 1 Assemblea circuito breve al suolo\n" +
            "B1209 EIC Switch-2 Guasto al circuito di montaggio\n" +
            "B1210 EIC-Interruttore 2 Assemblea circuito aperto\n" +
            "B1211 EIC-Interruttore 2 Assemblea circuito breve di batteria\n" +
            "B1212 EIC-Interruttore 2 Assemblea circuito breve al suolo\n" +
            "B1213 anti-furto numero programmato di chiavi è inferiore minimo\n" +
            "B1214 esecuzione bordo Guasto del circuito della lampada\n" +
            "B1215 esecuzione bordo corto circuito lampada a batteria\n" +
            "B1216 di emergenza e assistenza stradale lato corto circuito passare a terra\n" +
            "B1217 Corno relè bobina circuito fallimento\n" +
            "B1218 Corno di collegamento bobina a circuito breve Vbatt\n" +
            "B1219 serbatoio di carburante sensore di pressione del circuito guasto\n" +
            "B1220 serbatoio di carburante sensore di pressione a circuito aperto\n" +
            "B1222 combustibile sensore di temperatura # 1 circuito di guasto\n" +
            "B1223 combustibile sensore di temperatura # 1 circuito aperto\n" +
            "B1224 combustibile sensore di temperatura # 1 corto circuito a batteria\n" +
            "B1225 combustibile sensore di temperatura # 1 corto circuito a terra\n" +
            "B1226 sensore di temperatura del combustibile # 2 circuito di guasto\n" +
            "B1227 sensore di temperatura del combustibile # 2 circuito aperto\n" +
            "B1228 sensore di temperatura del combustibile # 2 corto circuito a batteria\n" +
            "B1229 sensore di temperatura del combustibile # 2 corto circuito a terra\n" +
            "B1231 accelerazione longitudinale soglia superata\n" +
            "B1232 vedere fabbricante\n" +
            "B1233 vetro mancata rottura del sensore\n" +
            "B1234 specchio passare codice non valido\n" +
            "B1235 finestra di feedback fallimento\n" +
            "B1236 finestra di feedback perdita di segnale\n" +
            "B1237 finestra di feedback di gamma\n" +
            "B1238 oltre temperatura colpa\n" +
            "B1239 flusso d'aria miscela porta circuito di pilotaggio fallimento\n" +
            "B1240 Lavatrice tergicristallo posteriore della pompa del circuito di collegamento per mancato\n" +
            "B1241 Lavatrice tergicristallo posteriore della pompa di collegamento a corto circuito batteria\n" +
            "B1242 flusso d'aria ricircolo porta circuito di pilotaggio fallimento\n" +
            "B1243 esprimere la finestra verso il basso interruttore di circuito breve per batteria\n" +
            "B1244 motore tergicristallo posteriore di collegamento per eseguire circuito fallimento\n" +
            "B1245 motore tergicristallo posteriore di collegamento per eseguire corto circuito a batteria\n" +
            "B1246 Dim pannello potenziometro interruttore di circuito guasto\n" +
            "B1247 pannello Dim passare circuito aperto\n" +
            "B1248 schienale del passeggero posteriore Autoglide interruttore di circuito breve al suolo\n" +
            "B1249 miscela porta fallimento\n" +
            "B1250 temperatura interna del circuito sensore fallimento\n" +
            "B1251 aria sensore di temperatura interna del circuito aperto\n" +
            "B1252 temperatura interna del sensore corto circuito a batteria\n" +
            "B1253 temperatura interna del sensore corto circuito a terra\n" +
            "B1254 aria sensore di temperatura esterna circuito fallimento\n" +
            "B1255 aria sensore di temperatura esterna circuito aperto\n" +
            "B1256 temperatura aria esterna sensore corto circuito a batteria\n" +
            "B1257 temperatura aria esterna sensore corto circuito a terra\n" +
            "B1258 sensore radiazione solare circuito fallimento\n" +
            "B1259 sensore radiazione solare circuito aperto\n" +
            "B1260 radiazione solare corto circuito del sensore di batteria\n" +
            "B1261 radiazione solare corto circuito del sensore a terra\n" +
            "B1262 servo motore sbrinamento circuito fallimento\n" +
            "B1263 servo motore bocca circuito fallimento\n" +
            "B1264 servo motore piede circuito fallimento\n" +
            "B1265 servo motore Coolair circuito di by-pass fallimento\n" +
            "B1266 servo motore Airintake sinistra circuito fallimento\n" +
            "B1267 servo motore Airintake diritto circuito fallimento\n" +
            "B1268 servo motore potenziometro sbrinamento circuito fallimento\n" +
            "B1269 servo motore potenziometro sbrinamento circuito aperto\n" +
            "B1270 servo motore potenziometro sbrinamento circuito breve di batteria\n" +
            "B1271 servo motore potenziometro sbrinamento corto circuito a terra\n" +
            "B1272 servo motore potenziometro bocca circuito fallimento\n" +
            "B1273 servo motore potenziometro circuito bocca aperta\n" +
            "B1274 servo motore potenziometro bocca circuito breve per batteria\n" +
            "B1275 servo motore potenziometro bocca circuito breve al suolo\n" +
            "B1276 servo motore potenziometro piedi circuito fallimento\n" +
            "B1277 servo motore potenziometro piedi circuito aperto\n" +
            "B1278 servo motore potenziometro piedi circuito breve di batteria\n" +
            "B1279 servo motore potenziometro corto circuito piedi a terra\n" +
            "B1280 servo motore potenziometro Coolair circuito fallimento\n" +
            "B1281 servo motore potenziometro Coolair circuito aperto\n" +
            "B1282 servo motore potenziometro Coolair corto circuito a batteria\n" +
            "B1283 servo motore potenziometro Coolair corto circuito a terra\n" +
            "B1284 servo motore potenziometro Airintake sinistra circuito fallimento\n" +
            "B1285 servo motore potenziometro Airintake sinistra circuito aperto\n" +
            "B1286 servo motore potenziometro Airintake rimasto a corto circuito batteria\n" +
            "B1287 servo motore potenziometro Airintake sinistra circuito breve al suolo\n" +
            "B1288 servo motore potenziometro Airintake diritto circuito fallimento\n" +
            "B1289 servo motore potenziometro Airintake diritto circuito aperto\n" +
            "B1290 servo motore potenziometro Airintake diritto a corto circuito batteria\n" +
            "B1291 servo motore potenziometro Airintake diritto circuito breve al suolo\n" +
            "B1292 batteria circuito di collegamento per mancato\n" +
            "B1293 batteria di collegamento circuito aperto\n" +
            "B1294 batteria di collegamento a corto circuito batteria\n" +
            "B1295 batteria corto circuito di collegamento a terra\n" +
            "B1296 alimentazione sensore circuito fallimento\n" +
            "B1297 alimentazione sensore circuito aperto\n" +
            "B1298 alimentazione sensore corto circuito a batteria\n" +
            "B1299 alimentazione sensore corto circuito a terra\n" +
            "B1300 potere porta blocco circuito fallimento\n" +
            "B1301 potere porta blocco circuito aperto\n" +
            "B1302 accessorio ritardo relè bobina circuito fallimento\n" +
            "B1303 accessorio ritardo relè bobina circuito aperto\n" +
            "B1304 accessorio ritardo relè bobina circuito breve di batteria\n" +
            "B1305 accessorio ritardo relè bobina circuito breve al suolo\n" +
            "B1306 livello olio passare circuito aperto\n" +
            "B1307 livello olio passare a breve circuito batteria\n" +
            "B1308 livello olio passare a breve al circuito di terra\n" +
            "B1309 potere porta blocco circuito breve al suolo\n" +
            "B1310 potere sbloccare porte circuito fallimento\n" +
            "B1311 potere sbloccare porte circuito aperto\n" +
            "B1312 lampada proiettore circuito di ingresso a breve batteria\n" +
            "B1313 batteria saver relè bobina circuito fallimento\n" +
            "B1314 batteria saver relè bobina circuito aperto\n" +
            "B1315 batteria Risparmio di collegamento bobina a corto circuito batteria\n" +
            "B1316 batteria saver relè bobina circuito breve al suolo\n" +
            "B1317 batteria ad alta tensione\n" +
            "B1318 batteria bassa tensione\n" +
            "B1319 driver porta socchiuso circuito fallimento\n" +
            "B1320 driver porta socchiuso circuito aperto\n" +
            "B1321 driver porta socchiuso circuito breve di batteria\n" +
            "B1322 driver porta socchiuso circuito breve al suolo\n" +
            "B1323 porta socchiuso Guasto del circuito della lampada\n" +
            "B1324 socchiuso porta lampada a circuito aperto\n" +
            "B1325 socchiuso porta lampada corto circuito a batteria\n" +
            "B1326 socchiuso porta lampada corto circuito a terra\n" +
            "B1327 passeggeri porta socchiuso circuito fallimento\n" +
            "B1328 passeggeri porta socchiuso circuito aperto\n" +
            "B1329 passeggeri porta socchiuso circuito breve di batteria\n" +
            "B1330 passeggeri porta socchiuso circuito breve al suolo\n" +
            "B1331 Decklid socchiuso lo sportello posteriore del circuito guasto\n" +
            "B1332 Decklid socchiuso lo sportello posteriore circuito aperto\n" +
            "B1333 Decklid socchiuso lo sportello posteriore corto circuito a batteria\n" +
            "B1334 Decklid socchiuso lo sportello posteriore corto circuito a terra\n" +
            "B1335 socchiuso lo sportello RR circuito fallimento\n" +
            "B1336 socchiuso lo sportello RR circuito aperto\n" +
            "B1337 socchiuso lo sportello RR corto circuito a batteria\n" +
            "B1338 socchiuso lo sportello RR corto circuito a terra\n" +
            "Din-don B1339 richiesta di ingresso del circuito corto di batteria\n" +
            "Din-don B1340 richiesta di ingresso del circuito breve al suolo\n" +
            "B1341 potere sbloccare porte circuito breve al suolo\n" +
            "B1342 ECU è difettoso\n" +
            "B1343 riscaldata Backlite circuito di ingresso fallimento\n" +
            "B1344 riscaldata Backlite ingresso circuito aperto\n" +
            "B1345 riscaldata Backlite ingresso circuito breve al suolo\n" +
            "B1346 riscaldata Backlite circuito di ingresso a breve batteria\n" +
            "B1347 riscaldata Backlite circuito di collegamento per mancato\n" +
            "B1348 riscaldata Backlite relè circuito aperto\n" +
            "B1349 riscaldata Backlite relè batteria breve per\n" +
            "B1350 riscaldata Backlite breve di collegamento a terra\n" +
            "B1351-chiave di accensione in corto circuito a batteria\n" +
            "B1352-chiave di accensione nel circuito di guasto\n" +
            "B1353-chiave di accensione in circuito aperto\n" +
            "B1354-chiave di accensione in corto circuito a terra\n" +
            "B1355 circuito di accensione Esegui fallimento\n" +
            "B1356 accensione Esegui circuito aperto\n" +
            "B1357 Esegui circuito di accensione a batteria breve\n" +
            "B1358 accensione Esegui circuito breve al suolo\n" +
            "B1359 accensione run / secondo circuito di guasto\n" +
            "B1360 accensione run / secondo circuito aperto\n" +
            "B1361 accensione run / Acc corto circuito a batteria\n" +
            "B1362 accensione run / Acc corto circuito a terra\n" +
            "B1363 inizio circuito di accensione fallimento\n" +
            "B1364 inizio circuito di accensione aperto\n" +
            "B1365 accensione iniziare a breve circuito batteria\n" +
            "B1366 circuito di accensione iniziare a breve a terra\n" +
            "B1367 circuito di accensione, reinserire la mancata\n" +
            "B1368 accensione, reinserire circuito aperto\n" +
            "B1369 circuito di accensione, reinserire la batteria breve per\n" +
            "B1370 accensione, reinserire circuito breve al suolo\n" +
            "B1371 illuminato entrata mancata relé circuito\n" +
            "B1372 illuminato di collegamento per l'ingresso del circuito aperto\n" +
            "B1373 illuminato di collegamento per l'ingresso a breve di batteria\n" +
            "B1374 illuminato l'ingresso a breve di collegamento a terra\n" +
            "B1375 cambio lampada circuito aperto\n" +
            "B1376 cambio lampada a corto circuito batteria\n" +
            "B1377 Oil Change Guasto del circuito della lampada\n" +
            "B1378 cambio corto circuito lampada a terra\n" +
            "B1379 Oil Change pulsante di reset corto circuito a terra\n" +
            "B1380 Oil Change pulsante di reset del circuito guasto\n" +
            "B1381 Oil Change pulsante di reset circuito aperto\n" +
            "B1382 Oil Change pulsante di reset corto circuito a batteria\n" +
            "B1383 livello olio lampada a corto circuito batteria\n" +
            "B1384 livello olio Guasto del circuito della lampada\n" +
            "B1385 livello olio lampada circuito aperto\n" +
            "B1386 livello olio lampada a corto circuito a terra\n" +
            "B1387 olio sensore di temperatura a circuito aperto\n" +
            "B1388 olio sensore di temperatura a corto circuito a batteria\n" +
            "B1389 olio sensore di temperatura circuito fallimento\n" +
            "B1390 olio sensore di temperatura a corto circuito a terra\n" +
            "B1391 livello olio passare circuito fallimento\n" +
            "B1392 potere di blocco di memoria porta di collegamento del circuito guasto\n" +
            "B1393 potere di blocco di memoria porta di collegamento del circuito aperto\n" +
            "B1394 potere di blocco di memoria porta di collegamento a corto circuito batteria\n" +
            "B1395 potere porta blocco di memoria a breve circuito di collegamento a terra\n" +
            "B1396 potere porta blocco circuito breve per batteria\n" +
            "B1397 potere sbloccare porte a corto circuito batteria\n" +
            "B1398 driver potere finestra One Touch finestra di collegamento del circuito guasto\n" +
            "B1399 driver potere finestra One Touch finestra di collegamento a circuito aperto\n" +
            "B1400 driver potere finestra One Touch finestra di collegamento a corto circuito batteria\n" +
            "B1401 driver potere finestra One Touch finestra di collegamento a corto circuito a terra\n" +
            "B1402 driver finestra verso il basso potere passare circuito fallimento\n" +
            "B1403 driver di potenza fino finestra passare circuito fallimento\n" +
            "B1404 driver finestra verso il basso potere circuito aperto\n" +
            "B1405 driver finestra verso il basso potere circuito breve di batteria\n" +
            "B1406 driver finestra verso il basso potere circuito breve al suolo\n" +
            "B1407 driver potere finestra fino a circuito aperto\n" +
            "B1408 driver potere finestra fino a corto circuito batteria\n" +
            "B1409 driver potere finestra fino a corto circuito a terra\n" +
            "B1410 driver potere finestra circuito di guasto a motore\n" +
            "B1411 driver finestra potenza motore circuito aperto\n" +
            "B1412 driver finestra potenza motore corto circuito a batteria\n" +
            "B1413 driver finestra potenza motore corto circuito a terra\n" +
            "B1414 potere finestra LR circuito di guasto a motore\n" +
            "B1415 potere finestra LR motore circuito aperto\n" +
            "B1416 potere finestra LR corto circuito a motore a batteria\n" +
            "B1417 potere finestra LR corto circuito a motore a terra\n" +
            "B1418 passeggeri potere finestra circuito di guasto a motore\n" +
            "B1419 passeggeri finestra potenza motore circuito aperto\n" +
            "B1420 passeggeri finestra potenza motore corto circuito a batteria\n" +
            "B1421 passeggeri finestra potenza motore corto circuito a terra\n" +
            "B1422 finestra potenza motore RR circuito fallimento\n" +
            "B1423 finestra potenza motore RR circuito aperto\n" +
            "B1424 finestra potenza motore RR circuito breve di batteria\n" +
            "B1425 finestra potenza motore RR circuito breve al suolo\n" +
            "B1426 lampada cintura di sicurezza a circuito breve batteria\n" +
            "B1427 lampada cintura di sicurezza a circuito aperto\n" +
            "B1428 lampada cintura di sicurezza a circuito fallimento\n" +
            "B1429 lampada cintura di sicurezza a circuito breve al suolo\n" +
            "B1430 cintura di sicurezza interruttore di circuito breve al suolo\n" +
            "B1431 tergicristallo freno / run circuito di collegamento per mancato\n" +
            "B1432 tergicristallo freno / run corto circuito di collegamento a batteria\n" +
            "B1433 tergicristallo freno / run corto circuito di collegamento a terra\n" +
            "B1434 tergicristallo hi / bassa velocità di collegamento bobina circuito fallimento\n" +
            "B1435 tergicristallo hi / bassa velocità di collegamento bobina a circuito aperto\n" +
            "B1436 tergicristallo hi / bassa velocità di collegamento bobina a corto circuito batteria\n" +
            "B1437 tergicristallo hi / bassa velocità di collegamento a corto circuito bobina a terra\n" +
            "B1438 tergicristallo selezionare la modalità passare circuito fallimento\n" +
            "B1439 tergicristallo selezionare Passa in modalità a circuito aperto\n" +
            "B1440 tergicristallo selezionare Passa in modalità a circuito breve per batteria\n" +
            "B1441 tergicristallo selezionare Passa in modalità a circuito breve al suolo\n" +
            "B1442 maniglia porte switch circuito fallimento\n" +
            "B1443 maniglia porte switch circuito aperto\n" +
            "B1444 porta manico corto circuito passare alla batteria\n" +
            "B1445 porta manico corto circuito passare a terra\n" +
            "B1446 tergicristallo parco senso circuito fallimento\n" +
            "B1447 tergicristallo parco senso circuito aperto\n" +
            "B1448 tergicristallo parco senso circuito breve di batteria\n" +
            "B1449 tergicristallo parco senso circuito breve al suolo\n" +
            "B1450 tergicristallo lavaggio / Switch ritardo circuito fallimento\n" +
            "B1451 tergicristallo lavaggio / Switch ritardo circuito aperto\n" +
            "B1452 tergicristallo lavaggio / ritardo passare a breve circuito batteria\n" +
            "B1453 tergicristallo lavaggio / Switch ritardo circuito breve al suolo\n" +
            "B1454 tergicristallo liquido lavavetri, ecc Guasto del circuito della lampada\n" +
            "B1455 tergicristallo liquido lavavetri, ecc lampada a circuito aperto\n" +
            "B1456 tergicristallo liquido lavavetri, ecc corto circuito lampada a batteria\n" +
            "B1457 tergicristallo liquido lavavetri, ecc lampada corto circuito a terra\n" +
            "B1458 tergicristallo Lavatrice pompa a motore circuito di collegamento per mancato\n" +
            "B1459 tergicristallo Lavatrice pompa a motore relè bobina circuito aperto\n" +
            "B1460 tergicristallo Lavatrice pompa a motore relè bobina circuito breve per batteria\n" +
            "B1461 tergicristallo Lavatrice pompa a motore relè bobina circuito breve al suolo\n" +
            "B1462 cintura di sicurezza interruttore di circuito guasto\n" +
            "B1463 cintura di sicurezza interruttore di circuito aperto\n" +
            "B1464 cintura di sicurezza interruttore di circuito breve di batteria\n" +
            "B1465 tergicristallo freno / run di collegamento circuito aperto\n" +
            "B1466 tergicristallo hi / bassa velocità di commutazione non\n" +
            "B1467 tergicristallo hi / bassa velocità motore corto circuito a batteria\n" +
            "Din-don B1468 circuito di ingresso richiesta fallimento\n" +
            "Din-don B1469 richiesta di ingresso del circuito aperto\n" +
            "B1470 lampada proiettore circuito di ingresso fallimento\n" +
            "B1471 lampada proiettore ingresso circuito aperto\n" +
            "B1472 lampada proiettore ingresso circuito breve al suolo\n" +
            "B1473 tergicristallo bassa velocità circuito guasto a motore\n" +
            "B1474 batteria Risparmio di collegamento del circuito di alimentazione a batteria breve\n" +
            "B1475 accessorio ritardo relè contatto a breve batteria\n" +
            "B1476 tergicristallo circuito ad alta velocità a motore fallimento\n" +
            "B1477 tergicristallo Hi / Low motore corto circuito a terra\n" +
            "B1478 potere finestra one touch up / down attivato contemporaneamente\n" +
            "B1479 tergicristallo livello del liquido lavavetri, ecc circuito sensore fallimento\n" +
            "B1480 tergicristallo livello del liquido lavavetri, ecc sensore circuito aperto\n" +
            "B1481 tergicristallo livello del liquido lavavetri, ecc corto circuito del sensore di batteria\n" +
            "B1482 tergicristallo livello del liquido lavavetri, ecc corto circuito del sensore a terra\n" +
            "B1483 pedale del freno d'ingresso fallimento\n" +
            "B1484 ingresso pedale del freno a circuito aperto\n" +
            "B1485 pedale del freno di ingresso del circuito batteria breve\n" +
            "B1486 pedale del freno di ingresso del circuito di terra a breve\n" +
            "B1487 porta anteriore Destra circuito fallimento\n" +
            "B1488 porta anteriore Destra circuito aperto\n" +
            "B1489 porta anteriore Destra batteria breve per\n" +
            "B1490 porta anteriore Destra a breve a terra\n" +
            "B1491 accensione cilindro circuito sensore fallimento\n" +
            "B1492 accensione cilindro sensore a circuito aperto\n" +
            "B1493 accensione cilindro sensore batteria breve\n" +
            "B1494 accensione cilindro sensore terreno breve\n" +
            "B1495 Decklid Punch-Out circuito sensore fallimento\n" +
            "B1496 Decklid Punch-Out sensore a circuito aperto\n" +
            "B1497 Decklid Punch-Out sensore batteria breve\n" +
            "B1498 Decklid Punch-Out sensore di terreno a breve\n" +
            "B1499 lampada segnale svoltare a sinistra circuito fallimento\n" +
            "B1500 lampada svoltare a sinistra segnale circuito aperto\n" +
            "B1501 lampada segnale svoltare a sinistra circuito breve di batteria\n" +
            "B1502 lampada segnale svoltare a sinistra circuito breve al suolo\n" +
            "B1503 lampada segnale svoltare a destra circuito fallimento\n" +
            "B1504 lampada svoltare a destra segnale circuito aperto\n" +
            "B1505 lampada segnale svoltare a destra circuito breve per batteria\n" +
            "B1506 lampada segnale svoltare a destra circuito breve al suolo\n" +
            "B1507 flash per passare passare circuito fallimento\n" +
            "B1508 flash per passare passare a circuito aperto\n" +
            "B1509 flash per passare passare a breve circuito batteria\n" +
            "B1510 flash per passare passare circuito breve al suolo\n" +
            "B1511 driver maniglia porta circuito fallimento\n" +
            "B1512 driver maniglia porta circuito aperto\n" +
            "B1513 driver porta manico corto circuito a batteria\n" +
            "B1514 driver porta manico corto circuito a terra\n" +
            "B1515 sedile conducente occupati interruttore di circuito guasto\n" +
            "B1516 sedile conducente occupati interruttore di circuito aperto\n" +
            "B1517 sedile conducente occupati interruttore di circuito breve per batteria\n" +
            "B1518 sedile conducente occupati interruttore di circuito breve al suolo\n" +
            "B1519 cappa interruttore di circuito guasto\n" +
            "B1520 cappa interruttore di circuito aperto\n" +
            "B1521 cappa interruttore di circuito breve per batteria\n" +
            "B1522 cappa interruttore di circuito breve al suolo\n" +
            "B1523 Keyless entrata circuito fallimento\n" +
            "B1524 Keyless entrata circuito aperto\n" +
            "B1525 Keyless entrata circuito breve di batteria\n" +
            "B1526 Keyless entrata circuito breve al suolo\n" +
            "B1527 memoria impostare interruttore di circuito guasto\n" +
            "B1528 memoria impostare interruttore di circuito aperto\n" +
            "B1529 memoria impostare interruttore di circuito breve per batteria\n" +
            "B1530 memoria impostare interruttore di circuito breve al suolo\n" +
            "B1531 memoria 1 interruttore di circuito guasto\n" +
            "B1532 memoria 1 interruttore di circuito aperto\n" +
            "B1533 memoria 1 interruttore di circuito breve di batteria\n" +
            "B1534 memoria 1 interruttore di circuito breve al suolo\n" +
            "B1535 memoria 2 Accendere circuito fallimento\n" +
            "B1536 memoria 2 Accendere circuito aperto\n" +
            "B1537 memoria 2 passare a breve circuito batteria\n" +
            "B1538 memoria 2 Accendere circuito breve al suolo\n" +
            "B1539 specchio driver passare Assemblea circuito fallimento\n" +
            "B1540 specchio driver passare Assemblea circuito aperto\n" +
            "B1541 specchio driver passare Assemblea circuito breve di batteria\n" +
            "B1542 specchio driver passare Assemblea circuito breve al suolo\n" +
            "B1543 passare direzione sede di montaggio del circuito guasto\n" +
            "B1544 sede direzione passare Assemblea circuito aperto\n" +
            "B1545 sede direzione passare Assemblea circuito breve per batteria\n" +
            "B1546 sede direzione passare Assemblea circuito breve al suolo\n" +
            "B1547 potere finestra master circuito fallimento\n" +
            "B1548 potere finestra master circuito aperto\n" +
            "B1549 potere finestra master circuito breve di batteria\n" +
            "B1550 potere finestra master circuito breve al suolo\n" +
            "B1551 Decklid mancato rilascio circuito\n" +
            "B1552 Decklid rilascio circuito aperto\n" +
            "B1553 Decklid rilascio circuito breve di batteria\n" +
            "B1554 Decklid rilascio circuito breve al suolo\n" +
            "B1555 accensione run / insuccesso iniziare circuito\n" +
            "B1556 accensione run / Start circuito aperto\n" +
            "B1557 accensione run / corto circuito iniziare a batteria\n" +
            "B1558 accensione run / Start circuito breve al suolo\n" +
            "B1559 porta blocco cilindro circuito fallimento\n" +
            "B1560 porta blocco cilindro circuito aperto\n" +
            "B1561 porta blocco cilindro breve circuito a batteria\n" +
            "B1562 porta blocco cilindro breve circuito di terra\n" +
            "B1563 porta socchiuso circuito fallimento\n" +
            "B1564 porta socchiuso circuito aperto\n" +
            "B1565 porta socchiuso circuito breve di batteria\n" +
            "B1566 porta socchiuso circuito breve al suolo\n" +
            "B1567 lampada proiettore ad alta fascio circuito fallimento\n" +
            "B1568 lampada proiettore ad alta fascio circuito aperto\n" +
            "B1569 lampada proiettore ad alta fascio corto circuito a batteria\n" +
            "B1570 lampada proiettore ad alta fascio corto circuito a terra\n" +
            "B1571 porta socchiuso LR circuito fallimento\n" +
            "B1572 porta socchiuso LR circuito aperto\n" +
            "B1573 porta socchiuso LR corto circuito a batteria\n" +
            "B1574 porta socchiuso LR corto circuito a terra\n" +
            "B1575 lampada parco circuito di ingresso fallimento\n" +
            "B1576 lampada parco ingresso circuito aperto\n" +
            "B1577 lampada parco circuito di ingresso a breve batteria\n" +
            "B1578 lampada parco ingresso circuito breve al suolo\n" +
            "B1579 Dim Pannello di aumentare il mancato ingresso del circuito\n" +
            "B1580 Dim pannello aumento ingresso circuito aperto\n" +
            "B1581 Dim Pannello di aumentare a breve circuito di ingresso a batteria\n" +
            "B1582 Dim Pannello di aumentare a breve circuito di ingresso al suolo\n" +
            "B1583 Dim Pannello di diminuire il mancato ingresso del circuito\n" +
            "B1584 Dim pannello diminuzione ingresso circuito aperto\n" +
            "B1585 Dim pannello diminuzione circuito di ingresso a breve di batteria\n" +
            "B1586 Dim pannello diminuzione ingresso circuito breve al suolo\n" +
            "B1587 Autolamp ritardo aumento circuito fallimento\n" +
            "B1588 Autolamp ritardo aumento circuito aperto\n" +
            "B1589 Autolamp ritardo aumento circuito breve di batteria\n" +
            "B1590 Autolamp ritardo aumento circuito breve al suolo\n" +
            "B1591 Autolamp ritardo diminuzione circuito fallimento\n" +
            "B1592 Autolamp ritardo diminuzione circuito aperto\n" +
            "B1593 Autolamp ritardo diminuzione circuito breve di batteria\n" +
            "B1594 Autolamp ritardo diminuzione circuito breve al suolo\n" +
            "B1595 interruttore di accensione ingresso illegale codice\n" +
            "B1596 servizio continuo Codici\n" +
            "B1597 sedile del conducente schienale Autoglide passare avanti circuito breve al suolo\n" +
            "B1598 sedile del conducente schienale posteriore Autoglide interruttore di circuito breve al suolo\n" +
            "B1599 schienale del passeggero Autoglide passare avanti circuito breve al suolo\n" +
            "B1600 Pats transponder chiave di accensione del segnale non viene ricevuto\n" +
            "B1601 Pats ricevuto errata-chiave di accensione dal codice chiave transponder\n" +
            "B1602 Pats ricevuto formato non valido di codice-chiave da chiave di accensione transponder\n" +
            "B1603 lampada anti-furto indicatore circuito fallimento\n" +
            "B1604 lampada anti-furto indicatore circuito aperto\n" +
            "B1605 lampada anti-furto corto circuito indicatore di batteria\n" +
            "B1606 lampada anti-furto indicatore corto circuito a terra\n" +
            "B1607 illuminato entrata in ingresso del circuito guasto\n" +
            "B1608 illuminato entrata in ingresso a circuito aperto\n" +
            "B1609 illuminato entrata ingresso di corto circuito a batteria\n" +
            "B1610 illuminato entrata ingresso di corto circuito a terra\n" +
            "B1611 tergicristallo posteriore per selezionare la modalità passare circuito fallimento\n" +
            "B1612 tergicristallo posteriore selezionare Passa in modalità a circuito aperto\n" +
            "B1613 tergicristallo posteriore per selezionare la modalità passare a breve circuito batteria\n" +
            "B1614 tergicristallo posteriore selezionare Passa in modalità a circuito breve al suolo\n" +
            "B1615 tergicristallo posteriore disattivare interruttore di circuito guasto\n" +
            "B1616 tergicristallo posteriore disattivare interruttore di circuito aperto\n" +
            "B1617 tergicristallo posteriore disattivare interruttore di circuito breve per batteria\n" +
            "B1618 tergicristallo posteriore disattivare interruttore di circuito breve al suolo\n" +
            "B1619 tergicristallo posteriore basso limite di ingresso del circuito guasto\n" +
            "B1620 tergicristallo posteriore basso limite di ingresso circuito aperto\n" +
            "B1621 tergicristallo posteriore basso limite di corto circuito di ingresso a batteria\n" +
            "B1622 tergicristallo posteriore basso limite di corto circuito di ingresso al suolo\n" +
            "B1623 lampada tastiera circuito di uscita fallimento\n" +
            "B1624 lampada tastiera uscita a circuito aperto\n" +
            "B1625 lampada tastiera uscita in caso di corto circuito a batteria\n" +
            "B1626 lampada tastiera corto circuito di uscita a terra\n" +
            "B1627 PRNDL invertire il mancato ingresso del circuito\n" +
            "B1628 PRNDL invertire ingresso a circuito aperto\n" +
            "B1629 PRNDL invertire ingresso a breve di batteria\n" +
            "B1630 PRNDL invertire ingresso di corto circuito a terra\n" +
            "B1631 specchio driver sinistra circuito fallimento\n" +
            "B1632 specchio driver sinistra circuito aperto\n" +
            "B1633 specchio conducente rimasto a corto circuito a batteria\n" +
            "B1634 specchio conducente rimasto a corto circuito a terra\n" +
            "B1635 specchio driver diritto circuito fallimento\n" +
            "B1636 specchio driver diritto circuito aperto\n" +
            "B1637 specchio driver diritto circuito breve per batteria\n" +
            "B1638 specchio driver diritto a breve a terra\n" +
            "B1639 specchio passeggeri sinistra circuito fallimento\n" +
            "B1640 specchio passeggeri sinistra circuito aperto\n" +
            "B1641 specchio passeggero rimasto a corto circuito a batteria\n" +
            "B1642 specchio passeggero rimasto a corto circuito a terra\n" +
            "B1643 specchio passeggeri diritto circuito fallimento\n" +
            "B1644 specchio passeggeri diritto circuito aperto\n" +
            "B1645 specchio passeggeri diritto a corto circuito batteria\n" +
            "B1646 specchio passeggeri diritto circuito breve al suolo\n" +
            "B1647 reclinare il sedile conducente avanti circuito fallimento\n" +
            "B1648 reclinare il sedile conducente avanti a circuito aperto\n" +
            "B1649 reclinare il sedile conducente avanti a corto circuito batteria\n" +
            "B1650 reclinare il sedile conducente avanti a corto circuito a terra\n" +
            "B1651 reclinare il sedile conducente indietro circuito fallimento\n" +
            "B1652 reclinare il sedile conducente indietro circuito aperto\n" +
            "B1653 reclinare il sedile conducente indietro corto circuito a batteria\n" +
            "B1654 reclinare il sedile conducente indietro corto circuito a terra\n" +
            "B1655 sedile posteriore conducente fino circuito fallimento\n" +
            "B1656 sedile posteriore driver fino a circuito aperto\n" +
            "B1657 sedile posteriore driver corto circuito fino a batteria\n" +
            "B1658 sedile posteriore driver corto circuito fino a terra\n" +
            "B1659 sedile anteriore conducente fino circuito fallimento\n" +
            "B1660 sedile anteriore conducente fino a circuito aperto\n" +
            "B1661 sedile anteriore conducente fino a corto circuito batteria\n" +
            "B1662 sedile anteriore conducente fino a corto circuito a terra\n" +
            "B1663 sedile anteriore conducente up / down stallo motore\n" +
            "B1664 sedile posteriore driver up / down stallo motore\n" +
            "B1665 sedile conducente avanti / indietro di una fase di stallo motore\n" +
            "B1666 reclinare il sedile conducente stallo motore\n" +
            "B1667 specchio driver up / down stallo motore\n" +
            "B1668 specchio driver destra / sinistra stallo motore\n" +
            "B1669 specchio passeggeri su / giù stallo motore\n" +
            "B1670 specchio passeggeri a destra / sinistra stallo motore\n" +
            "B1671 modulo batteria tensione fuori gamma\n" +
            "B1672 sedile conducente occupati circuito di ingresso fallimento\n" +
            "B1673 sedile conducente occupati ingresso circuito aperto\n" +
            "B1674 sedile conducente occupati circuito di ingresso a breve batteria\n" +
            "B1675 sedile conducente occupati ingresso circuito breve al suolo\n" +
            "B1676 tensione batteria di serie\n" +
            "B1677 allarme di panico circuito di ingresso fallimento\n" +
            "B1678 allarme di panico ingresso circuito aperto\n" +
            "B1679 allarme di panico corto circuito di ingresso a batteria\n" +
            "B1680 allarme di panico corto circuito di ingresso al suolo\n" +
            "B1681 Pats transceiver modulo segnale non viene ricevuto\n" +
            "B1682 Pats è disattivato (controllare legame tra Pats e transponder)\n" +
            "B1683 specchio conducente / passeggero interruttore di circuito guasto\n" +
            "B1684 specchio conducente / passeggero interruttore di circuito aperto\n" +
            "B1685 lampada cupola d'ingresso fallimento\n" +
            "B1686 lampada cupola ingresso circuito aperto\n" +
            "B1687 lampada cupola corto circuito di ingresso a batteria\n" +
            "B1688 lampada cupola ingresso circuito breve al suolo\n" +
            "B1689 Autolamp ritardo circuito fallimento\n" +
            "B1690 Autolamp ritardo circuito aperto\n" +
            "B1691 Autolamp circuito breve ritardo di batteria\n" +
            "B1692 Autolamp ritardo circuito breve al suolo\n" +
            "B1693 Autolamp sul circuito di guasto\n" +
            "B1694 Autolamp sul circuito aperto\n" +
            "B1695 Autolamp sul circuito corto di batteria\n" +
            "B1696 Autolamp sul circuito breve al suolo\n" +
            "B1697 specchio conducente / passeggero interruttore di circuito breve per batteria\n" +
            "B1698 specchio conducente / passeggero interruttore di circuito breve al suolo\n" +
            "B1699 sedile del passeggero occupati interruttore di circuito breve al suolo";
    static String B1700B2606 = "B1700 passeggeri del riduttore di tensione cinture circuito breve al suolo\n" +
            "B1701 reclinare il sedile conducente avanti interruttore di circuito guasto\n" +
            "B1702 reclinare il sedile conducente avanti interruttore di circuito aperto\n" +
            "B1703 reclinare il sedile conducente avanti interruttore di circuito breve per batteria\n" +
            "B1704 reclinare il sedile conducente avanti interruttore di circuito breve al suolo\n" +
            "B1705 reclinare il sedile posteriore driver interruttore di circuito guasto\n" +
            "B1706 reclinare il sedile posteriore driver interruttore di circuito aperto\n" +
            "B1707 reclinare il sedile posteriore driver interruttore di circuito breve per batteria\n" +
            "B1708 reclinare il sedile posteriore driver interruttore di circuito breve al suolo\n" +
            "B1709 sedile anteriore conducente fino interruttore di circuito guasto\n" +
            "B1710 sedile anteriore conducente fino interruttore di circuito aperto\n" +
            "B1711 sedile anteriore conducente fino interruttore di circuito breve di batteria\n" +
            "B1712 sedile anteriore conducente fino interruttore di circuito breve al suolo\n" +
            "B1713 sedile anteriore conducente Down passare circuito fallimento\n" +
            "B1714 sedile anteriore conducente Down passare circuito aperto\n" +
            "B1715 sedile anteriore conducente Down passare a breve circuito batteria\n" +
            "B1716 sedile anteriore conducente Down passare circuito breve al suolo\n" +
            "B1717 sedile conducente avanti interruttore di circuito guasto\n" +
            "B1718 sedile conducente avanti interruttore di circuito aperto\n" +
            "B1719 sedile conducente avanti interruttore di circuito breve per batteria\n" +
            "B1720 sedile conducente avanti interruttore di circuito breve al suolo\n" +
            "B1721 sedile posteriore driver passare circuito fallimento\n" +
            "B1722 sedile posteriore driver passare circuito aperto\n" +
            "B1723 sedile posteriore driver passare a breve circuito batteria\n" +
            "B1724 sedile posteriore driver passare a breve al circuito di terra\n" +
            "B1725 sedile posteriore conducente fino interruttore di circuito guasto\n" +
            "B1726 sedile posteriore conducente fino interruttore di circuito aperto\n" +
            "B1727 sedile posteriore conducente fino interruttore di circuito breve per batteria\n" +
            "B1728 sedile posteriore conducente fino interruttore di circuito breve al suolo\n" +
            "B1729 sedile posteriore driver Down passare circuito fallimento\n" +
            "B1730 sedile posteriore driver Down passare circuito aperto\n" +
            "B1731 sedile posteriore driver Down passare a breve circuito batteria\n" +
            "B1732 sedile posteriore driver Down passare circuito breve al suolo\n" +
            "B1733 driver specchio verticale passare circuito fallimento\n" +
            "B1734 driver specchio verticale passare circuito aperto\n" +
            "B1735 driver specchio verticale passare a breve circuito batteria\n" +
            "B1736 driver specchio verticale passare a breve al circuito di terra\n" +
            "B1737 specchio driver orizzontale passare circuito fallimento\n" +
            "B1738 specchio driver orizzontale passare circuito aperto\n" +
            "B1739 specchio driver orizzontale passare a breve circuito batteria\n" +
            "B1740 specchio driver orizzontale passare a breve al circuito di terra\n" +
            "B1741 specchio verticale passeggeri passare circuito fallimento\n" +
            "B1742 specchio verticale passeggeri passare circuito aperto\n" +
            "B1743 specchio verticale passeggeri passare a breve circuito batteria\n" +
            "B1744 specchio verticale passeggeri passare circuito breve al suolo\n" +
            "B1745 specchio passeggeri orizzontale passare circuito fallimento\n" +
            "B1746 specchio passeggeri orizzontale passare circuito aperto\n" +
            "B1747 specchio passeggeri orizzontale passare a breve circuito batteria\n" +
            "B1748 specchio passeggeri orizzontale passare a breve al circuito di terra\n" +
            "B1749 Parco / neutro interruttore di circuito guasto\n" +
            "B1750 Parco / neutro interruttore di circuito aperto\n" +
            "B1751 Parco / neutro interruttore di circuito breve per batteria\n" +
            "B1752 Parco / neutro interruttore di circuito breve al suolo\n" +
            "B1753 pericolo flash circuito di uscita fallimento\n" +
            "B1754 pericolo flash uscita circuito aperto\n" +
            "B1755 pericolo flash circuito di uscita a breve batteria\n" +
            "B1756 pericolo flash breve circuito di uscita a terra\n" +
            "B1757 sedile posteriore driver Down circuito fallimento\n" +
            "B1758 sedile posteriore driver Down circuito aperto\n" +
            "B1759 sedile posteriore driver Down circuito breve di batteria\n" +
            "B1760 sedile posteriore driver circuito breve discesa a terra\n" +
            "B1761 sedile anteriore conducente Down circuito fallimento\n" +
            "B1762 sedile anteriore conducente Down circuito aperto\n" +
            "B1763 sedile anteriore conducente Down circuito breve di batteria\n" +
            "B1764 sedile anteriore conducente circuito breve discesa a terra\n" +
            "B1765 sedile conducente avanti circuito fallimento\n" +
            "B1766 sedile conducente avanti a circuito aperto\n" +
            "B1767 sedile conducente avanti a corto circuito batteria\n" +
            "B1768 sedile conducente avanti a corto circuito a terra\n" +
            "B1769 sedile conducente indietro circuito fallimento\n" +
            "B1770 sedile conducente indietro circuito aperto\n" +
            "B1771 sedile conducente indietro circuito breve di batteria\n" +
            "B1772 sedile conducente indietro circuito breve al suolo\n" +
            "B1773 specchio conducente fino circuito fallimento\n" +
            "B1774 specchio driver fino a circuito aperto\n" +
            "B1775 specchio driver fino a corto circuito batteria\n" +
            "B1776 specchio driver fino a corto circuito a terra\n" +
            "B1777 conducente cinture riduttore di tensione corto circuito a terra\n" +
            "B1778 specchio driver Down circuito fallimento\n" +
            "B1779 specchio driver Down circuito aperto\n" +
            "B1780 specchio driver Down circuito breve di batteria\n" +
            "B1781 specchio driver breve discesa a terra\n" +
            "B1782 specchio passeggeri fino circuito fallimento\n" +
            "B1783 specchio passeggeri fino a circuito aperto\n" +
            "B1784 specchio passeggeri fino a corto circuito batteria\n" +
            "B1785 specchio passeggeri fino a corto circuito a terra\n" +
            "B1786 specchio di passeggeri verso il basso circuito fallimento\n" +
            "B1787 specchio di passeggeri verso il basso circuito aperto\n" +
            "B1788 specchio di passeggeri verso il basso corto circuito a batteria\n" +
            "B1789 specchio di passeggeri verso il basso corto circuito a terra\n" +
            "B1790 Autolamp sensore ingresso circuito fallimento\n" +
            "B1791 Autolamp sensore ingresso circuito aperto\n" +
            "B1792 Autolamp sensore ingresso al circuito breve batteria\n" +
            "B1793 Autolamp sensore ingresso circuito breve al suolo\n" +
            "B1794 lampada proiettore a bassa fascio circuito fallimento\n" +
            "B1795 lampada proiettore a bassa fascio circuito aperto\n" +
            "B1796 lampada proiettore a bassa fascio corto circuito a batteria\n" +
            "B1797 lampada proiettore a bassa fascio corto circuito a terra\n" +
            "B1798 lampada svoltare a fronte del segnale di uscita del circuito guasto\n" +
            "B1799 lampada svoltare a fronte del segnale di uscita a circuito aperto\n" +
            "B1800 lampada svoltare a fronte del segnale di uscita del circuito a breve batteria\n" +
            "B1801 lampada svoltare a fronte del segnale di uscita del circuito breve al suolo\n" +
            "B1802 lampada svoltare a segnale di uscita posteriore circuito fallimento\n" +
            "B1803 lampada svoltare a segnale di uscita posteriore circuito aperto\n" +
            "B1804 lampada svoltare a segnale di uscita posteriore corto circuito a batteria\n" +
            "B1805 lampada svoltare a segnale di uscita posteriore corto circuito a terra\n" +
            "B1806 lampada di coda di uscita del circuito guasto\n" +
            "B1807 lampada di coda di uscita circuito aperto\n" +
            "B1808 lampada di coda in uscita a breve circuito batteria\n" +
            "B1809 lampada di coda di uscita del circuito breve al suolo\n" +
            "B1810 lampada di backup passare il mancato ingresso del circuito\n" +
            "B1811 lampada di backup passare ingresso circuito aperto\n" +
            "B1812 lampada di backup passare circuito di ingresso a breve batteria\n" +
            "B1813 lampada di backup passare ingresso circuito breve al suolo\n" +
            "B1814 motore tergicristallo posteriore verso il basso relè bobina circuito fallimento\n" +
            "B1815 motore tergicristallo posteriore verso il basso relè bobina circuito aperto\n" +
            "B1816 motore tergicristallo posteriore verso il basso di collegamento bobina a corto circuito batteria\n" +
            "B1817 motore tergicristallo posteriore verso il basso relè bobina circuito breve al suolo\n" +
            "B1818 tergicristallo posteriore a motore fino a relè bobina circuito fallimento\n" +
            "B1819 tergicristallo posteriore a motore fino a relè bobina circuito aperto\n" +
            "B1820 tergicristallo posteriore a motore fino a relè bobina circuito breve per batteria\n" +
            "B1821 tergicristallo posteriore a motore fino a relè bobina circuito breve al suolo\n" +
            "B1822 tergicristallo posteriore parco senso circuito di ingresso fallimento\n" +
            "B1823 tergicristallo posteriore parco senso di ingresso circuito aperto\n" +
            "B1824 tergicristallo posteriore parco senso di ingresso al circuito breve batteria\n" +
            "B1825 tergicristallo posteriore parco senso di ingresso del circuito breve al suolo\n" +
            "B1826 tergicristallo posteriore alto limite di ingresso del circuito guasto\n" +
            "B1827 tergicristallo posteriore alto limite di ingresso circuito aperto\n" +
            "B1828 tergicristallo posteriore alto limite di corto circuito di ingresso a batteria\n" +
            "B1829 tergicristallo posteriore alto limite di corto circuito di ingresso al suolo\n" +
            "B1830 sbloccare porte disarmare interruttore di circuito guasto\n" +
            "B1831 sbloccare porte disarmare interruttore di circuito aperto\n" +
            "B1832 sbloccare porte disarmare interruttore di circuito breve per batteria\n" +
            "B1833 sbloccare porte disarmare interruttore di circuito breve al suolo\n" +
            "B1834 disarmare sbloccare porte di uscita del circuito guasto\n" +
            "B1835 disarmare sbloccare porte di uscita circuito aperto\n" +
            "B1836 disarmare sbloccare porte di uscita a breve circuito batteria\n" +
            "B1837 sbloccare porte disarmare corto circuito di uscita a terra\n" +
            "B1838 batteria saver potere di collegamento del circuito guasto\n" +
            "B1839 tergicristallo posteriore circuito di guasto a motore\n" +
            "B1840 tergicristallo anteriore potere circuito fallimento\n" +
            "B1841 tergicristallo anteriore potere circuito aperto\n" +
            "B1842 tergicristallo anteriore corto circuito di alimentazione a batteria\n" +
            "B1843 tergicristallo anteriore corto circuito di alimentazione di terreno\n" +
            "B1844 telefono portatile circuito fallimento\n" +
            "B1845 circuito di accensione di manomissione fallimento\n" +
            "B1846 accensione di manomissione circuito aperto\n" +
            "B1847 accensione di manomissione circuito breve di batteria\n" +
            "B1848 accensione di manomissione circuito breve al suolo\n" +
            "B1849 clima di controllo delle differenze di temperatura circuito fallimento\n" +
            "B1850 clima di controllo delle differenze di temperatura a circuito aperto\n" +
            "B1851 clima di controllo delle differenze di temperatura a corto circuito a batteria\n" +
            "B1852 clima di controllo delle differenze di temperatura a corto circuito a terra\n" +
            "B1853 clima di controllo aereo sensore di temperatura interna del circuito guasto a motore\n" +
            "B1854 clima di controllo aereo sensore di temperatura interna motore circuito aperto\n" +
            "B1855 clima di controllo aereo sensore di temperatura interna motore corto circuito a batteria\n" +
            "B1856 clima di controllo aereo sensore di temperatura interna motore corto circuito a terra\n" +
            "B1857 clima di controllo on / off circuito fallimento\n" +
            "B1858 clima di controllo A / C pressione interruttore di circuito guasto\n" +
            "B1859 clima di controllo A / C pressione interruttore di circuito aperto\n" +
            "B1860 clima di controllo A / C pressione interruttore di circuito breve per batteria\n" +
            "B1861 clima di controllo A / C pressione interruttore di circuito breve al suolo\n" +
            "B1862 clima di controllo A / C bloccare il sensore guasto\n" +
            "B1863 terreno di ECU circuito aperto\n" +
            "B1864 batteria di alimentazione del circuito di ECU fallimento\n" +
            "B1865 batteria di alimentazione di ECU circuito aperto\n" +
            "B1866 batteria di alimentazione corto circuito di ECU a batteria\n" +
            "B1867 batteria di alimentazione corto circuito di ECU a terra\n" +
            "B1868 lampada air bag indicatore di avviso circuito fallimento\n" +
            "B1869 lampada air bag indicatore di avviso circuito aperto\n" +
            "B1870 lampada air bag indicatore di avviso corto circuito a batteria\n" +
            "B1871 air bag passeggero disattivare modulo guasto\n" +
            "B1872 svoltare a segnale / pericolo di alimentazione corto circuito a batteria\n" +
            "B1873 svoltare a segnale / pericolo di alimentazione corto circuito a terra\n" +
            "B1874 telefono cellulare non è presente\n" +
            "B1875 svoltare a segnale / Switch segnale di pericolo circuito fallimento\n" +
            "B1876 cinture driver Pretensioner circuito fallimento\n" +
            "B1877 cinture driver Pretensioner circuito aperto\n" +
            "B1878 cinture driver Pretensioner corto circuito a batteria\n" +
            "B1879 cinture driver Pretensioner corto circuito a terra\n" +
            "B1880 cinture passeggeri Pretensioner circuito fallimento\n" +
            "B1881 cinture passeggeri Pretensioner circuito aperto\n" +
            "B1882 cinture passeggeri Pretensioner circuito breve di batteria\n" +
            "B1883 cinture passeggeri Pretensioner circuito breve al suolo\n" +
            "B1884 pad avvertimento lampada non funzionante\n" +
            "B1885 cinture driver Pretensioner circuito a bassa resistenza a Squib\n" +
            "B1886 cinture passeggeri Pretensioner circuito a bassa resistenza Squib\n" +
            "B1887 air bag circuito di pilotaggio a bassa resistenza o in corto insieme\n" +
            "B1888 air bag passeggero circuito a bassa resistenza o in corto insieme\n" +
            "B1889 airbag passeggero disattivare modulo sensore ostruite\n" +
            "B1890 pad avviso corto circuito lampada a batteria\n" +
            "B1891 air bag tono di avviso corto circuito indicatore di batteria\n" +
            "B1892 air bag tono di avviso indicatore circuito fallimento\n" +
            "B1893 antenna GPS circuito aperto\n" +
            "B1894 tergicristallo posteriore per velocità motore senso circuito fallimento\n" +
            "B1895 conducente / passeggero socchiuso la porta di uscita del circuito guasto\n" +
            "B1896 Driver's / passeggeri socchiuso la porta di uscita del circuito corto di batteria\n" +
            "B1897 Corno passare circuito fallimento\n" +
            "Din-don B1898 Input # 2 corto circuito a massa\n" +
            "B1899 segnale di ingresso microfono circuito aperto\n" +
            "B1900 airbag lato conducente colpa\n" +
            "B1901 air bag crash sensore # 1 feed / corto circuito di ritorno a terra\n" +
            "B1902 air bag crash sensore # 1 circuito di guasto a terra\n" +
            "B1903 air bag crash sensore # 1 terra a corto circuito batteria\n" +
            "B1904 air bag crash sensore # 2 feed / ritorno circuito fallimento\n" +
            "B1905 air bag crash sensore # 2 feed / ritorno a breve circuito batteria\n" +
            "B1906 air bag crash sensore # 2 feed / corto circuito di ritorno a terra\n" +
            "B1907 air bag crash sensore # 2 circuito guasto a terra\n" +
            "B1908 air bag crash sensore # 2 corto circuito a terra a batteria\n" +
            "B1909 air bag crash sensore # 2 corto circuito terra-terra\n" +
            "B1910 air bag diagnostici monitor a circuito guasto a terra\n" +
            "B1911 air bag diagnostici monitor terreno circuito breve di batteria\n" +
            "B1912 air bag diagnostici monitor a circuito corto terra-terra\n" +
            "B1913 air bag conducente / passeggero corto circuito a terra\n" +
            "Air Bag B1914 Crash Sensori # 1 / # 2 corto circuito a terra\n" +
            "B1915 air bag circuito di pilotaggio fallimento\n" +
            "B1916 air bag corto circuito di pilotaggio di batteria\n" +
            "B1917 air bag memoria circuito chiaro fallimento\n" +
            "B1918 air bag memoria chiaro circuito aperto\n" +
            "B1919 air bag chiaro circuito di memoria a breve a batteria\n" +
            "B1920 air bag passeggero circuito fallimento\n" +
            "B1921 air bag diagnostici monitor terreno circuito aperto\n" +
            "B1922 air bag Safing di uscita del sensore corto circuito a batteria\n" +
            "B1923 air bag memoria chiaro circuito breve al suolo\n" +
            "B1924 air bag interno diagnostici controllare la colpa o la colpa del sistema disarmare\n" +
            "B1925 air bag passeggero corto circuito a batteria\n" +
            "B1926 air bag passeggero pressione interruttore di circuito guasto\n" +
            "B1927 airbag lato passeggero colpa\n" +
            "B1928 air bag Safing circuito di uscita del sensore di fallimento\n" +
            "B1929 air bag Safing di uscita del sensore di circuito aperto\n" +
            "B1930 air bag Safing di uscita del sensore corto circuito a terra\n" +
            "B1931 air bag crash sensore # 1 feed / ritorno circuito fallimento\n" +
            "B1932 air bag conducente circuito aperto\n" +
            "B1933 air bag passeggero circuito aperto\n" +
            "B1934 air bag conducente circuito di inflazione bassa resistenza a Squib\n" +
            "B1935 air bag passeggero circuito di inflazione bassa resistenza a Squib\n" +
            "B1936 air bag conducente circuito breve al suolo\n" +
            "B1937 air bag passeggero pressione interruttore di circuito aperto\n" +
            "B1938 air bag passeggero corto circuito a terra\n" +
            "B1939 air bag passeggero pressione interruttore di circuito breve al suolo\n" +
            "B1941 air bag crash sensore # 1 feed / ritorno circuito aperto\n" +
            "B1942 air bag crash sensore # 2 feed / ritorno circuito aperto\n" +
            "B1943 air bag crash sensore # 1 corto circuito terra-terra\n" +
            "B1944 air bag crash sensore # 1 terreno circuito aperto\n" +
            "B1945 air bag crash sensore # 2 terreno circuito aperto\n" +
            "B1946 clima di controllo A / C post evaporatore circuito sensore fallimento\n" +
            "B1947 clima di controllo A / C post evaporatore sensore corto circuito a terra\n" +
            "B1948 clima di controllo sensore della temperatura dell'acqua del circuito guasto\n" +
            "B1949 clima di controllo sensore della temperatura dell'acqua del circuito breve al suolo\n" +
            "B1950 sedile posteriore up / down potenziometro di feedback circuito fallimento\n" +
            "B1951 sedile posteriore up / down potenziometro di feedback circuito aperto\n" +
            "B1952 sedile posteriore up / down potenziometro di feedback circuito breve di batteria\n" +
            "B1953 sedile posteriore up / down potenziometro di feedback circuito breve al suolo\n" +
            "B1954 sedile anteriore su / giù potenziometro di feedback circuito fallimento\n" +
            "B1955 sedile anteriore su / giù potenziometro di feedback circuito aperto\n" +
            "B1956 sedile anteriore su / giù potenziometro di feedback circuito breve di batteria\n" +
            "B1957 sedile anteriore su / giù potenziometro di feedback circuito breve al suolo\n" +
            "B1958 reclinare il sedile in avanti / indietro potenziometro di feedback circuito fallimento\n" +
            "B1959 reclinare il sedile in avanti / indietro potenziometro di feedback circuito aperto\n" +
            "B1960 reclinare il sedile in avanti / indietro potenziometro di feedback circuito breve per batteria\n" +
            "B1961 reclinare il sedile in avanti / indietro potenziometro di feedback circuito breve al suolo\n" +
            "B1962 sede orizzontale in avanti / all'indietro potenziometro di feedback circuito fallimento\n" +
            "B1963 sede orizzontale in avanti / all'indietro potenziometro di feedback circuito aperto\n" +
            "B1964 sede orizzontale in avanti / all'indietro potenziometro di feedback circuito breve di batteria\n" +
            "B1965 sede orizzontale in avanti / all'indietro potenziometro di feedback circuito breve al suolo\n" +
            "B1966 A / C post sensore circuito di riscaldamento a fallimento\n" +
            "B1967 A / C post sensore circuito di riscaldamento a breve a terra\n" +
            "B1968 A / C pompa di acqua del circuito di rilevamento guasto\n" +
            "B1969 A / C frizione magnetica Avaria del circuito di comando\n" +
            "B1970 passeggeri schienale in avanti interruttore di circuito breve al suolo\n" +
            "B1971 passeggeri schienale posteriore interruttore di circuito breve al suolo\n" +
            "B1972 sedile passeggero posteriore fino interruttore di circuito breve di batteria\n" +
            "B1973 sedile passeggero posteriore verso il basso interruttore di circuito breve per batteria\n" +
            "B1974 sedile del passeggero reclinare in avanti passare a breve circuito batteria\n" +
            "B1975 passeggeri reclinare il sedile posteriore corto circuito passare a batteria\n" +
            "B1976 sedile del passeggero avanti interruttore di circuito breve per batteria\n" +
            "B1977 passeggeri del sedile anteriore fino interruttore di circuito breve per batteria\n" +
            "B1978 passeggeri del sedile anteriore verso il basso interruttore di circuito breve per batteria\n" +
            "B1979 Sedile posteriore corto circuito passare a batteria\n" +
            "B1980 bulbo - interruzione condizione Riconosciuto\n" +
            "B1981 memoria off circuito breve di batteria\n" +
            "B1982 driver della porta di collegamento per sbloccare circuito fallimento\n" +
            "B1983 driver della porta di collegamento per sbloccare corto circuito a batteria\n" +
            "B1984 sede lombare passare del circuito Gonfiare fallimento\n" +
            "B1985 sede lombare deflazionare interruttore di circuito guasto\n" +
            "B1986 sedile del conducente schienale posteriore Autoglide interruttore di circuito guasto\n" +
            "B1987 pedale avanti / all'indietro stallo motore\n" +
            "B1988 trasmettere la posizione del pedale interruttore di circuito breve di batteria\n" +
            "B1989 pedale posizione arretrata interruttore di circuito breve per batteria\n" +
            "B1990 pedale avanti / all'indietro potenziometro di feedback circuito fallimento\n" +
            "B1991 pedale avanti / all'indietro potenziometro di feedback circuito breve di batteria\n" +
            "B1992 lato conducente, airbag lato monte corto circuito a Vbatt\n" +
            "B1993 lato conducente, airbag lato monte corto circuito a terra\n" +
            "B1994 lato conducente, airbag lato monte circuito aperto\n" +
            "B1995 driver laterale, Montaggio laterale Airbag bassa resistenza Squib\n" +
            "B1996 lato passeggero, airbag laterali per montaggio a circuito breve Vbatt\n" +
            "B1997 lato passeggero, airbag laterali montare circuito breve al suolo\n" +
            "B1998 lato passeggero, airbag laterali montare circuito aperto\n" +
            "B1999 lato passeggero, Airbag laterali montare a bassa resistenza a Squib\n" +
            "B2100 porta driver chiave cilindro passare fallimento\n" +
            "B2101 testa passare riposare circuito fallimento\n" +
            "B2102 antenna corto circuito a terra\n" +
            "B2103 antenna non è collegato\n" +
            "B2104 porta passeggeri chiave cilindro passare fallimento\n" +
            "B2105 posizione di ingresso del gas di bassa gamma\n" +
            "B2106 posizione di ingresso del gas di alta gamma\n" +
            "B2107 tergicristallo anteriore a motore relè per circuito breve Vbatt\n" +
            "B2108 tronco chiave cilindro passare fallimento\n" +
            "B2109 riscaldata Vento Shield di collegamento a corto Vbatt (modificato dal mancato 2/6/97)\n" +
            "B2110 Front Wiper motore di collegamento del circuito Open (modificato dal mancato 2/6/97)\n" +
            "B2111 bloccare tutte le porte di ingresso a breve a terra\n" +
            "B2112 driver porta il commutatore bloccato fallimento\n" +
            "B2113 parabrezza riscaldato ingresso a breve a terra\n" +
            "B2114 fronte Lavatrice ingresso a breve a terra\n" +
            "B2115 Lavatrice ingresso posteriore breve a terra\n" +
            "B2116 porta driver pulsante reset bloccato fallimento\n" +
            "B2117 driver laterale, Montaggio laterale Airbag bassa capacità a Squib\n" +
            "B2118 lato passeggero, Airbag laterali montare a bassa capacità a Squib\n" +
            "B2119 compressore fallimento\n" +
            "B2120 porta il commutatore di passeggeri bloccati fallimento\n" +
            "B2122 driver di comunicazione via satellite lato corto circuito a terra\n" +
            "B2123 lato passeggero di comunicazione via satellite corto circuito a terra\n" +
            "B2124 porta passeggeri pulsante reset bloccato fallimento\n" +
            "B2128 centrale blocco motore fallimento\n" +
            "B2129 blocco centrale di feedback fallimento\n" +
            "B2130 doppio blocco timeout fallimento\n" +
            "B2131 doppia serratura di feedback fallimento\n" +
            "B2132 dimmer passare a circuito breve GND\n" +
            "B2133 freno motore avvertimento Guasto del circuito della lampada\n" +
            "B2134 freno motore avvertimento lampada a circuito breve Vbatt\n" +
            "B2135 parco freno applicato avvertimento Guasto del circuito della lampada\n" +
            "B2136 parco freno applicato avvertimento lampada corto circuito a batteria\n" +
            "B2139 dati Note a piè pagina (la ricezione di dati non corrisponde a ciò che era previsto)\n" +
            "B2141 NVM configurazione fallimento\n" +
            "B2142 NVM tic fallimento\n" +
            "B2143 memoria NVM fallimento\n" +
            "B2144 NVM allarme dati fallimento\n" +
            "B2145 NVM RF HR fallimento\n" +
            "B2146 reclinare il sedile a motore posizione di gamma\n" +
            "B2148 circuito PWM input fallimento\n" +
            "B2149 sedile anteriore posizione verticale a motore di serie\n" +
            "B2150 Alimentazione # 1 corto circuito a massa\n" +
            "B2151 Alimentazione # 2 corto circuito a massa\n" +
            "B2152 sedile posteriore posizione verticale a motore di serie\n" +
            "B2153 posteriore eco circuito sensore fallimento\n" +
            "B2154 fronte echo circuito sensore fallimento\n" +
            "B2155 sedile posizione orizzontale a motore di serie\n" +
            "B2156 posteriore doppler circuito sensore fallimento\n" +
            "B2157 fronte Doppler circuito sensore fallimento\n" +
            "B2158 reclinare il sedile a motore memoria posizione di gamma\n" +
            "B2159 Memoria # 1 uscita a breve a terra\n" +
            "B2160 Memoria # 1 uscita a breve VBatt\n" +
            "B2161 sedile anteriore motore verticale memoria posizione di gamma\n" +
            "B2162 dati Note a piè pagina # 2 (ricezione di dati non corrisponde a ciò che era previsto)\n" +
            "B2163 frizione posizione colpa\n" +
            "B2164 sedile posteriore verticale motore memoria posizione di gamma\n" +
            "B2165 cambio di posizione di guasto\n" +
            "B2166 Gear selezionare posizione di guasto\n" +
            "B2167 sede a motore orizzontale memoria posizione di gamma\n" +
            "B2168 Impossibile confermare Sblocca Condizione\n" +
            "B2169 Impossibile confermare blocco Condizione\n" +
            "B2170 colonna dello sterzo LOCK circuito fallimento\n" +
            "B2172 inerzia passare ingresso circuito aperto\n" +
            "B2174 driver finestra posteriore remoto fino a breve passare alla batteria\n" +
            "B2175 A / C richiesta circuito breve segnale a terra\n" +
            "B2176 Overdrive interruttore di circuito a breve Vbatt\n" +
            "B2177 Interni circuito sensore di scansione fallimento\n" +
            "B2178 driver finestra posteriore telecomando verso il basso per passare a breve batteria\n" +
            "B2179 tergicristallo anteriore passare selezionare \"A\" a breve a terra\n" +
            "B2180 tergicristallo anteriore passare selezionare \"B\" a breve a terra\n" +
            "B2181 tergicristallo anteriore selezionare passare a \"C\" a breve a terra\n" +
            "B2182 finestra passeggero anteriore remoto fino a breve passare alla batteria\n" +
            "B2183 tergicristallo anteriore passare selezionare \"H\" a breve a terra\n" +
            "B2184 tergicristallo anteriore passare selezionare \"W\" a breve a terra\n" +
            "B2185 tergicristallo posteriore passare selezionare \"D\" a breve a terra\n" +
            "B2186 finestra passeggero anteriore telecomando verso il basso per passare a breve batteria\n" +
            "B2187 tergicristallo posteriore passare selezionare \"B\" a breve a terra\n" +
            "B2188 tergicristallo posteriore selezionare Switch \"E\" breve a terra\n" +
            "B2190 finestra passeggero posteriore remoto fino a breve passare alla batteria\n" +
            "B2194 finestra passeggero posteriore telecomando verso il basso per passare a breve batteria\n" +
            "B2195 driver finestra su / giù potere circuito breve al suolo\n" +
            "B2196 passeggeri finestra su / giù potere circuito breve al suolo\n" +
            "B2197 TV modulo errore\n" +
            "B2198 Trafficmaster modulo errore\n" +
            "B2199 VICS modulo errore\n" +
            "N. B2200 comunicazione al modulo TV (n. Montaggio di TV)\n" +
            "B2201 Nessuna comunicazione con il traffico MasterModule\n" +
            "N. B2202 comunicazione al VICS Module (n. Montaggio di VICS)\n" +
            "B2203 CD-ROM di errore\n" +
            "B2204 antenna GPS o connessione aperta a breve\n" +
            "B2205 ricevitore GPS errore\n" +
            "B2206 giroscopio errore\n" +
            "B2207 ECU ROM checksum errore\n" +
            "B2208 comunicazione link per visualizzare e passare modulo errore\n" +
            "B2209 Interni lampada override passare a circuito aperto\n" +
            "B2210 Interni lampada override passare a breve a terra\n" +
            "B2211 bassa uscita refrigerante lampada corto circuito a batteria\n" +
            "B2214 finestra passeggero anteriore fino a breve passare alla batteria\n" +
            "B2215 finestra passeggero anteriore verso il basso per passare a breve batteria\n" +
            "B2219 finestra di fronte driver corrente di feedback superato\n" +
            "B2220 driver finestra posteriore attuale di feedback superato\n" +
            "B2221 passeggero anteriore finestra corrente di feedback superato\n" +
            "B2222 finestra passeggero posteriore attuale di feedback superato\n" +
            "B2223 specchio driver drive circuito fallimento\n" +
            "B2224 specchio circuito unità passeggeri fallimento\n" +
            "B2225 crash frontale sensore Monte colpa\n" +
            "B2226 crash frontale sensore interno colpa\n" +
            "B2227 frontale sensore di crash del driver di comunicazione colpa\n" +
            "B2228 Air Bag corto circuito di pilotaggio a terra - Loop # 2\n" +
            "Air Bag B2229 passeggeri a corto circuito a terra - Loop # 2\n" +
            "Air Bag B2230 driver corto circuito a batteria - Loop # 2\n" +
            "Air Bag B2231 passeggeri a corto circuito a batteria - Loop # 2\n" +
            "B2232 air bag conducente circuito aperto - loop # 2\n" +
            "B2233 Air Bag passeggero circuito aperto - Loop # 2\n" +
            "B2234 air bag conducente circuito di inflazione bassa resistenza a Squib - loop # 2\n" +
            "B2235 air bag passeggero circuito di inflazione\n" +
            "B2236 debole o Defected veicoli elettrici modulo batteria colpa\n" +
            "B2237 veicolo segnale che indica parco mentre VSS presente\n" +
            "B2238 cavo di alimentazione per il potere porta scorrevole rotto\n" +
            "B2239 carico posteriore porta il commutatore Stuck (a breve al suolo)\n" +
            "B2240 Cargo porta posteriore pulsante reset bloccato (a breve al suolo)\n" +
            "B2241 Cargo porta posteriore serratura corto circuito a terra\n" +
            "B2242 carico posteriore sbloccare porte circuito aperto\n" +
            "B2243 driver porta posteriore socchiuso circuito aperto\n" +
            "B2244 driver di porta scorrevole socchiuso corto circuito a GND\n" +
            "B2245 passeggero posteriore porta socchiuso circuito aperto\n" +
            "B2246 passeggeri porta scorrevole socchiuso corto circuito a GND\n" +
            "B2247 EV batteria temperatura colpa\n" +
            "B2248 parabrezza riscaldato relè bobina circuito fallimento\n" +
            "B2249 testa lampada di collegamento bobina a breve batteria\n" +
            "B2250 sbloccare tutte le porte di collegamento del circuito guasto\n" +
            "B2251 Parklamp relè d'uscita circuito di pilotaggio fallimento\n" +
            "B2252 Parklamp relè d'uscita a breve Dirver batteria\n" +
            "B2300 sedile conducente memoria errore di posizione\n" +
            "B2301 sedile passeggero memoria errore di posizione\n" +
            "B2302 poggiatesta del sedile di feedback potenziometro circuito fallimento\n" +
            "B2303 poggiatesta del sedile di feedback potenziometro circuito aperto\n" +
            "B2304 poggiatesta del sedile di feedback potenziometro corto circuito a batteria\n" +
            "B2305 poggiatesta del sedile di feedback potenziometro corto circuito a terra\n" +
            "B2306 sede poggiatesta stallo motore\n" +
            "B2310 specchio driver di memoria errore di posizione\n" +
            "B2311 specchio passeggeri memoria errore di posizione\n" +
            "B2312 specchio passeggeri orizzontale di feedback potenziometro circuito fallimento\n" +
            "B2313 specchio passeggeri orizzontale di feedback potenziometro circuito aperto\n" +
            "B2314 specchio passeggeri orizzontale di feedback potenziometro circuito breve per batteria\n" +
            "B2315 specchio passeggeri orizzontale di feedback potenziometro circuito breve al suolo\n" +
            "B2316 passeggeri specchio verticale di feedback potenziometro circuito fallimento\n" +
            "B2317 passeggeri specchio verticale di feedback potenziometro circuito aperto\n" +
            "B2318 passeggeri specchio verticale di feedback potenziometro corto circuito a batteria\n" +
            "B2319 passeggeri specchio verticale di feedback potenziometro corto circuito a terra\n" +
            "B2320 specchio orizzontale driver di feedback potenziometro circuito fallimento\n" +
            "B2321 specchio orizzontale driver di feedback potenziometro circuito aperto\n" +
            "B2322 specchio orizzontale driver di feedback potenziometro circuito breve per batteria\n" +
            "B2323 specchio orizzontale driver di feedback potenziometro circuito breve al suolo\n" +
            "B2324 driver specchio verticale di feedback potenziometro circuito fallimento\n" +
            "B2325 driver specchio verticale di feedback potenziometro circuito aperto\n" +
            "B2326 driver specchio verticale di feedback potenziometro corto circuito a batteria\n" +
            "B2327 driver specchio verticale di feedback potenziometro corto circuito a terra\n" +
            "B2328 colonna raggiungere feedback potenziometro circuito fallimento\n" +
            "B2329 colonna raggiungere feedback potenziometro circuito aperto\n" +
            "B2330 colonna raggiungere feedback potenziometro circuito breve per batteria\n" +
            "B2331 colonna raggiungere feedback potenziometro circuito breve al suolo\n" +
            "B2332 colonna inclinazione di feedback potenziometro circuito fallimento\n" +
            "B2333 colonna inclinazione di feedback potenziometro circuito aperto\n" +
            "B2334 colonna inclinazione di feedback potenziometro circuito breve per batteria\n" +
            "B2335 colonna inclinazione di feedback potenziometro circuito breve al suolo\n" +
            "B2336 specchio passare Assemblea circuito fallimento\n" +
            "B2337 specchio passare Assemblea circuito aperto\n" +
            "B2338 specchio passare Assemblea circuito breve di batteria\n" +
            "B2339 specchio interruttore di circuito breve montaggio a terra\n" +
            "B2340 colonna raggiungere una fase di stallo motore\n" +
            "B2341 colonna inclinazione stallo motore\n" +
            "B2342 passare sede di riferimento comune positivo tensione a circuito aperto\n" +
            "B2343 passare sede di riferimento di tensione positiva comune di approvvigionamento a bassa tensione\n" +
            "B2344 passare sede di riferimento comune tensione positiva tensione di alimentazione guasto\n" +
            "B2345 sede passare tensione negativa di riferimento comune a circuito aperto\n" +
            "B2346 specchio passare tensione di riferimento positivo comune a circuito aperto\n" +
            "B2347 passare specchio di riferimento di tensione positiva comune di approvvigionamento a bassa tensione\n" +
            "B2348 specchio passare tensione di riferimento comune positivo tensione di alimentazione guasto\n" +
            "B2349 specchio passare tensione negativa di riferimento comune a circuito aperto\n" +
            "B2350 colonna dello sterzo interruttore di circuito breve per batteria\n" +
            "B2351 colonna dello sterzo interruttore di circuito guasto\n" +
            "B2352 driver di memoria interruttore di alimentazione del circuito indicatore di batteria breve\n" +
            "B2353 driver specchio potere driver circuito breve terra\n" +
            "B2354 driver specchio orizzontale / verticale di feedback potenziometro circuito aperto\n" +
            "B2355 passeggeri specchio orizzontale / verticale di feedback potenziometro circuito aperto\n" +
            "B2357 driver finestra verso il basso senso attuale basso circuito fallimento\n" +
            "B2362 telecomando apertura / chiusura circuito breve segnale a terra\n" +
            "B2363 sistema di sensori ottici per la mancata\n" +
            "B2364 carburante porta di riempimento circuito aperto\n" +
            "B2365 B-pilastro potere porta scorrevole apertura / chiusura interruttore ingresso Ckt a breve GND\n" +
            "B2366 PI potere porta scorrevole per aprire / chiudere Ckt passare a breve a GND\n" +
            "B2367 potere porta scorrevole di ingresso override passare a breve Ckt GND\n" +
            "B2368 colonna dello sterzo interruttore di circuito di serie\n" +
            "Din-don B2369 uscita richiesta Ckt breve a terra\n" +
            "B2373 LED # 1 corto circuito a batteria\n" +
            "B2374 potere di arresto scorrevole (chiavistello) circuito di guasto\n" +
            "B2380 riscaldatore refrigerante Temp sensore corto circuito a GND\n" +
            "B2381 riscaldamento a temperatura liquido di raffreddamento a circuito aperto sensore\n" +
            "B2384 audio invertire Mute aiuto ingresso Ckt fallimento\n" +
            "B2385 audio in ingresso mute navigazione Ckt fallimento\n" +
            "B2401 piastra di registrazione audio meccanismo di colpa\n" +
            "B2402 CD audio / dj shutdown termico colpa\n" +
            "B2403 CD audio / dj interno colpa\n" +
            "B2404 audio volante interruttore di circuito di guasto\n" +
            "B2405 audio-disco singolo lettore CD shutdown termico colpa\n" +
            "B2406-audio unico disco CD Player interno colpa\n" +
            "B2416 clima di controllo attuatore ricircolo dei limiti\n" +
            "B2425 telecomando Keyless entrata di sincronizzazione\n" +
            "B2426 passeggeri sensore radiazione solare circuito aperto\n" +
            "B2427 passeggeri radiazione solare corto circuito del sensore a terra\n" +
            "B2428 A / C post riscaldamento sensore # 2 circuito fallimento\n" +
            "B2429 A / C postale riscaldatore Sensore # 2 corto circuito a massa\n" +
            "B2431 transponder di programmazione fallita\n" +
            "B2432 driver fibbia della cintura di sicurezza interruttore di circuito aperto\n" +
            "B2433 driver fibbia della cintura di sicurezza interruttore di circuito breve di batteria\n" +
            "B2434 driver fibbia della cintura di sicurezza interruttore di circuito breve al suolo\n" +
            "B2435 driver fibbia della cintura di sicurezza interruttore resistenza di gamma\n" +
            "B2436 passeggeri fibbia della cintura di sicurezza interruttore di circuito aperto\n" +
            "B2437 passeggeri fibbia della cintura di sicurezza interruttore di circuito breve di batteria\n" +
            "B2438 passeggeri fibbia della cintura di sicurezza interruttore di circuito breve al suolo\n" +
            "B2439 passeggeri fibbia della cintura di sicurezza interruttore resistenza di gamma\n" +
            "B2440 lato passeggero, sensore di crash laterale montare colpa\n" +
            "B2441 Driver Side, Side sensore di crash montare colpa\n" +
            "B2442 intrusione sensore guasto\n" +
            "B2443 Powertrain performance modalità circuito fallimento\n" +
            "B2444 driver lato crash sensore interno colpa\n" +
            "B2445 lato passeggero crash sensore interno colpa\n" +
            "B2446 RESCU / VEMS ingresso circuito aperto\n" +
            "B2447 RESCU / VEMS circuito di ingresso a breve batteria\n" +
            "B2448 RESCU / VEMS ingresso circuito breve al suolo\n" +
            "B2449 aux riscaldamento candela di preriscaldo circuito breve al suolo\n" +
            "B2450 aux riscaldamento candela di preriscaldo circuito aperto\n" +
            "B2451 aux pompa di combustibile di riscaldamento a circuito breve al suolo\n" +
            "B2452 aux pompa di combustibile di riscaldamento a circuito aperto\n" +
            "B2453 aux riscaldamento Ventilatore ventilatore circuito breve al suolo\n" +
            "B2454 aux riscaldamento Ventilatore ventilatore circuito aperto\n" +
            "B2455 aux riscaldamento soffiatore colpevolizzata\n" +
            "B2456 aux riscaldamento liquido di raffreddamento del sensore corto circuito a terra\n" +
            "B2457 aux riscaldamento del circuito di raffreddamento del sensore aperto\n" +
            "B2458 aux riscaldamento surriscaldamento sensore corto circuito a terra\n" +
            "B2459 aux riscaldamento surriscaldamento sensore circuito aperto\n" +
            "B2460 aux riscaldamento fiamma sensore circuito breve al suolo\n" +
            "B2461 aux fiamma di riscaldamento a circuito aperto sensore\n" +
            "B2462 aux fiamma di riscaldamento fuori colpa\n" +
            "B2463 aux colpa di riscaldamento a surriscaldarsi\n" +
            "B2464 aux riscaldamento orario di inizio superato\n" +
            "B2465 Aux Riscaldatore Counter Superamento Start / Sistema bloccato (come di seguito?)\n" +
            "B2466 aux riscaldamento surriscaldare contrastare superamento / sistema bloccato\n" +
            "B2467 Aux Riscaldatore Cool Down superato il tempo (può essere considerata alla a453-5)\n" +
            "B2468 aux riscaldamento pompa del circuito di raffreddamento a breve a terra\n" +
            "B2469 aux riscaldamento liquido di raffreddamento a circuito aperto pompa\n" +
            "B2470 Interni fan corto circuito di controllo a terra\n" +
            "B2471 ventola di controllo interno circuito aperto\n" +
            "B2472 proiettore fendinebbia passare fallimento\n" +
            "B2473 passeggeri porta disarmare ckt passare a breve a terra\n" +
            "B2474 passeggeri porta blocco passare in corto circuito a terra\n" +
            "B2475 passeggeri sbloccare porte switch in corto circuito a terra\n" +
            "B2476 radio presenti passare Ckt fallimento\n" +
            "B2477 modulo di configurazione fallimento\n" +
            "B2478 anti furto segnale di ingresso a breve a terra\n" +
            "B2479 freno parco interruttore di circuito breve al suolo\n" +
            "B2480 LF angolo di uscita lampada Ckt breve a batteria\n" +
            "B2481 convertibili top up / down passare colpa\n" +
            "B2482 RF angolo di uscita lampada Ckt breve a batteria\n" +
            "B2483 Attiva segnale circuito aperto\n" +
            "B2484 disattivare breve segnale a terra\n" +
            "B2485 LF lato ripetitore lampada Ckt uscita a breve batteria\n" +
            "B2487 RF lato ripetitore lampada Ckt uscita a breve batteria\n" +
            "B2489 UNDERHOOD lampada di uscita del circuito guasto\n" +
            "B2490 UNDERHOOD lampada corto circuito di uscita a batteria\n" +
            "B2491 RF parco lampada corto circuito di uscita a batteria\n" +
            "B2492 già programmato (Modalità di prova DTC solo!)\n" +
            "B2493 LF parco lampada corto circuito di uscita a batteria\n" +
            "B2494 anti furto corno corto circuito di uscita a Batt\n" +
            "B2495 anti furto corno di uscita del circuito guasto\n" +
            "B2496 anti furto corno corto circuito di uscita a GND\n" +
            "B2499 cortesia lampada uscita fallimento\n" +
            "B2500 cortesia lampada Ckt uscita a breve batteria\n" +
            "B2501 LF lampada anabbagliante circuito fallimento\n" +
            "B2502 LF lampada anabbagliante corto circuito a batteria\n" +
            "B2503 RF lampada anabbagliante circuito fallimento\n" +
            "B2504 RF lampada anabbagliante corto circuito a batteria\n" +
            "B2505 LF lampada ad alta fascio circuito fallimento\n" +
            "B2506 LF lampada ad alta fascio corto circuito a batteria\n" +
            "B2507 RF lampada ad alta fascio circuito fallimento\n" +
            "B2508 RF lampada ad alta fascio corto circuito a batteria\n" +
            "B2509 luce posteriore per nebbia interruttore di circuito guasto\n" +
            "B2510 soffiatore a motore principale di collegamento a corto circuito batteria\n" +
            "B2511 Corno di uscita a relè per circuito breve batteria\n" +
            "B2512 fendinebbia anteriore relè Ckt breve a batteria\n" +
            "B2513 Ventola (Fan) circuito di guasto\n" +
            "B2514 Ventola (Fan) del circuito corto di Vbatt\n" +
            "B2515 riscaldamento soffiatore di collegamento del circuito guasto\n" +
            "B2516 soffiatore Avaria del circuito di comando\n" +
            "B2517 elettrico di emergenza al largo sistema colpevolizzata\n" +
            "B2518 compressore Overtemp colpa\n" +
            "B2519 alta fermata Monte Guasto del circuito della lampada\n" +
            "B2520 alta montare luce di arresto a breve circuito batteria\n" +
            "B2523 licenza Guasto del circuito della lampada\n" +
            "B2524 licenza lampada a corto circuito batteria\n" +
            "B2525 posteriore sinistro di backup Guasto del circuito della lampada\n" +
            "B2526 posteriore sinistro di backup lampada a corto circuito batteria\n" +
            "B2527 posteriore sinistro luce di arresto circuito fallimento\n" +
            "B2528 posteriore sinistro luce di arresto a breve circuito batteria\n" +
            "B2529 svoltare a sinistra posteriore Guasto del circuito della lampada\n" +
            "B2530 svoltare a sinistra posteriore corto circuito lampada a batteria\n" +
            "B2531 posteriore destro backup Guasto del circuito della lampada\n" +
            "B2532 posteriore destro backup lampada a corto circuito batteria\n" +
            "B2533 posteriore destro luce di arresto circuito fallimento\n" +
            "B2534 posteriore destro luce di arresto a breve circuito batteria\n" +
            "B2535 svoltare a destra posteriore Guasto del circuito della lampada\n" +
            "B2536 svoltare a destra posteriore corto circuito lampada a batteria\n" +
            "B2539 Aux A / C Modalità posizione di riferimento circuito breve al suolo\n" +
            "B2540 Aux A / C posizione modalità di riferimento a breve circuito batteria\n" +
            "B2543 Aux A / C Control Switch circuito breve riferimento al suolo\n" +
            "B2544 Aux A / C Control Switch circuito breve riferimento a batteria\n" +
            "B2545 sistema di collegamento del circuito di alimentazione a batteria breve\n" +
            "B2546 sistema di collegamento del circuito di potenza fallimento\n" +
            "B2550 lampada cupola corto circuito di uscita a terra\n" +
            "B2553 disattivare l'uscita del segnale a breve circuito batteria\n" +
            "B2554 lampada cupola di uscita del circuito guasto\n" +
            "B2555 lampada cupola corto circuito di uscita a batteria\n" +
            "B2556 Attiva segnale circuito breve per batteria\n" +
            "B2557 sinistra potere porta scorrevole apertura / chiusura del circuito di uscita a breve batteria\n" +
            "B2558 diritto di potere porta scorrevole apertura / chiusura del circuito di uscita a breve batteria\n" +
            "B2559 Aux A / C soffiatore a motore corto circuito di collegamento a batteria\n" +
            "B2560 Aux A / C soffiatore a motore corto circuito di collegamento a terra\n" +
            "B2561 Aux A / C Ventola velocità 1 circuito fallimento\n" +
            "B2562 Aux A / C Ventola velocità 1 circuito breve al suolo\n" +
            "B2563 Aux A / C Ventola 2 velocità circuito fallimento\n" +
            "B2564 Aux A / C Ventola 2 velocità circuito breve al suolo\n" +
            "B2565 diritto di coda Guasto del circuito della lampada\n" +
            "B2566 diritto di coda lampada corto circuito a terra\n" +
            "B2567 invertire specchio di uscita del circuito guasto\n" +
            "B2568 invertire specchio corto circuito di uscita a terra\n" +
            "B2569 Liftgate disarmare interruttore di circuito breve al suolo\n" +
            "B2570 diritto lampada segnale di interruzione del circuito breve al suolo\n" +
            "B2571 sinistra lampada segnale di interruzione del circuito breve al suolo\n" +
            "B2580 aux soffiatore senso passare circuito fallimento\n" +
            "B2581 sedile passeggeri occupanti corto circuito di rilevamento a terra\n" +
            "B2582 sedile passeggeri occupanti di rilevamento circuito aperto\n" +
            "B2583 bambino sede di rilevamento corto circuito a terra\n" +
            "B2584 bambino sede di rilevamento circuito aperto\n" +
            "B2585 anti furto segnale di ingresso al circuito breve batteria\n" +
            "B2586 proiettore selezionare la modalità circuito fallimento\n" +
            "B2587 sedile passeggeri occupanti di rilevamento corto circuito a batteria\n" +
            "B2588 bambino sede di rilevamento corto circuito a batteria\n" +
            "B2589 imprevisto durante l'inversione porta stretta\n" +
            "B2590 parco veicoli / velocità del segnale del circuito guasto\n" +
            "B2591 fermo segnale mancante durante Unlatch\n" +
            "B2592 PSD non completamente chiusa (modulo comandato con successo)\n" +
            "B2593 potere porta scorrevole aperto durante modulo vicino comando\n" +
            "N. B2594 movimento rilevato dopo un Unlatch durante potere aperto\n" +
            "B2595 anti furto segnale di ingresso del circuito guasto\n" +
            "B2596 proiettore scopo di uscita a relè per circuito breve batteria\n" +
            "B2597 proiettore obiettivo circuito di uscita a relè guasto\n" +
            "B2598 proiettore circuito di collegamento per mancato\n" +
            "B2599 sponda rilascio circuito aperto\n" +
            "B2600 doppia porta di blocco motore congelati\n" +
            "N. B2601 linguetta segnale avvertito sulla chiusura porte e invertita\n" +
            "B2602 mancanti levetta di potenza del segnale durante la porta scorrevole Unlatch\n" +
            "B2603 PSD non completamente chiuso durante il self-test\n" +
            "B2604 potere porta scorrevole On / Off a circuito aperto\n" +
            "B2605 disattivare il segnale circuito aperto\n" +
            "B2606 A / C sensore di temperatura di serie";
    static String U0001U2500 = "U0001 ad alta velocità può bus di comunicazione\n" +
            "U0002 ad alta velocità di comunicazione può autobus prestazioni\n" +
            "U0003 ad alta velocità di comunicazione può autobus di linea (+) aperto\n" +
            "U0004 ad alta velocità di comunicazione può autobus di linea (+) basso\n" +
            "U0005 ad alta velocità di comunicazione può autobus (+) Alta\n" +
            "U0006 ad alta velocità può bus di comunicazione (-) Aperta\n" +
            "U0007 ad alta velocità può bus di comunicazione (-) Bassa\n" +
            "U0008 ad alta velocità può bus di comunicazione (-) ad alta\n" +
            "U0009 POSSONO ad alta velocità di comunicazione Bus (-) a corto autobus (+)\n" +
            "U0010 medie velocità di comunicazione bus\n" +
            "U0011 medie velocità di comunicazione può autobus prestazioni\n" +
            "U0012 medie velocità di comunicazione può autobus di linea (+) aperto\n" +
            "U0013 medie velocità di comunicazione può autobus di linea (+) basso\n" +
            "U0014 medie velocità di comunicazione può autobus (+) Alta\n" +
            "U0015 medie velocità può bus di comunicazione (-) Aperta\n" +
            "U0016 medie velocità può bus di comunicazione (-) Bassa\n" +
            "U0017 medie velocità può bus di comunicazione (-) ad alta\n" +
            "U0018 a media velocità di comunicazione CAN Bus (-) a corto autobus (+)\n" +
            "U0019 bassa velocità di comunicazione può autobus\n" +
            "U0020 bassa velocità di comunicazione può autobus prestazioni\n" +
            "U0021 bassa velocità di comunicazione può autobus di linea (+) aperto\n" +
            "U0022 bassa velocità di comunicazione può autobus di linea (+) basso\n" +
            "U0023 bassa velocità di comunicazione può autobus (+) Alta\n" +
            "U0024 bassa velocità di comunicazione può autobus (-) Aperta\n" +
            "U0025 bassa velocità di comunicazione può autobus (-) Bassa\n" +
            "U0026 bassa velocità di comunicazione può autobus (-) ad alta\n" +
            "U0027 a bassa velocità di comunicazione CAN Bus (-) a corto autobus (+)\n" +
            "U0028 veicolo di comunicazione autobus A\n" +
            "U0029 veicolo di comunicazione Un autobus prestazioni\n" +
            "U0030 veicolo di comunicazione Bus A (+) Aperta\n" +
            "U0031 veicolo di comunicazione Bus A (+) Bassa\n" +
            "U0032 veicolo di comunicazione Bus A (+) Alta\n" +
            "U0033 veicolo di comunicazione Bus A (-) Aperta\n" +
            "U0034 veicolo di comunicazione Bus A (-) Bassa\n" +
            "U0035 veicolo di comunicazione Bus A (-) Alta\n" +
            "U0036 veicolo di comunicazione Bus A (-) a corto Un autobus (+)\n" +
            "U0037 veicolo di comunicazione bus B\n" +
            "U0038 veicolo di comunicazione bus B Performance\n" +
            "U0039 veicolo di comunicazione Bus B (+) Aperta\n" +
            "U0040 veicolo di comunicazione Bus B (+) Bassa\n" +
            "U0041 veicolo di comunicazione Bus B (+) Alta\n" +
            "U0042 veicolo di comunicazione Bus B (-) Aperta\n" +
            "U0043 veicolo di comunicazione Bus B (-) Bassa\n" +
            "U0044 veicolo di comunicazione Bus B (-) Alta\n" +
            "U0045 veicolo di comunicazione Bus B (-) a corto Bus B (+)\n" +
            "U0046 veicolo di comunicazione bus C\n" +
            "U0047 veicolo di comunicazione bus C Performance\n" +
            "U0048 veicolo di comunicazione Bus C (+) Aperta\n" +
            "U0049 veicolo di comunicazione Bus C (+) Bassa\n" +
            "U0050 veicolo di comunicazione Bus C (+) Alta\n" +
            "U0051 veicolo di comunicazione Bus C (-) Aperta\n" +
            "U0052 veicolo di comunicazione Bus C (-) Bassa\n" +
            "U0053 veicolo di comunicazione Bus C (-) Alta\n" +
            "U0054 veicolo di comunicazione Bus C (-) a corto Bus C (+)\n" +
            "U0055 veicolo di comunicazione bus D\n" +
            "U0056 veicolo di comunicazione bus D prestazioni\n" +
            "U0057 veicolo di comunicazione Bus D (+) Aperta\n" +
            "U0058 veicolo di comunicazione Bus D (+) Bassa\n" +
            "U0059 veicolo di comunicazione Bus D (+) Alta\n" +
            "U0060 veicolo di comunicazione Bus D (-) Aperta\n" +
            "U0061 veicolo di comunicazione Bus D (-) Bassa\n" +
            "U0062 veicolo di comunicazione Bus D (-) Alta\n" +
            "U0063 veicolo di comunicazione Bus D (-) a corto Bus D (+)\n" +
            "U0064 veicolo di comunicazione e autobus\n" +
            "U0065 veicolo di comunicazione e autobus prestazioni\n" +
            "U0066 veicolo di comunicazione Bus E (+) Aperta\n" +
            "U0067 veicolo di comunicazione Bus E (+) Bassa\n" +
            "U0068 veicolo di comunicazione Bus E (+) Alta\n" +
            "U0069 veicolo di comunicazione Bus E (-) Aperta\n" +
            "U0070 veicolo di comunicazione Bus E (-) Bassa\n" +
            "U0071 veicolo di comunicazione Bus E (-) Alta\n" +
            "U0072 veicolo di comunicazione Bus E (-) a corto Autobus E (+)\n" +
            "U0073 modulo di controllo bus di comunicazione off\n" +
            "U0100 perso la comunicazione con ECM / PCM \"A\"\n" +
            "U0101 perso la comunicazione con TCM\n" +
            "U0102 perso la comunicazione con i caso di trasferimento di controllo modulo\n" +
            "U0103 perso la comunicazione con cambio modulo\n" +
            "U0104 perso la comunicazione con Cruise Control Module\n" +
            "U0105 perso la comunicazione con iniettore di combustibile modulo di controllo\n" +
            "U0106 perso la comunicazione con candela di preriscaldo modulo di controllo\n" +
            "U0107 perso la comunicazione con i gas di controllo modulo attuatore\n" +
            "U0108 perso la comunicazione con i carburanti alternativi modulo di controllo\n" +
            "U0109 perso la comunicazione con pompa di combustibile modulo di controllo\n" +
            "U0110 perso la comunicazione con motore modulo di controllo\n" +
            "U0111 perso la comunicazione con l'energia della batteria di controllo Modulo A\n" +
            "U0112 perso la comunicazione con l'energia della batteria di controllo modulo B\n" +
            "U0113 perso la comunicazione con i critici di controllo delle emissioni informazioni\n" +
            "U0114 perso la comunicazione con quattro ruote motrici modulo di controllo della frizione\n" +
            "U0115 perso la comunicazione con ECM / pcm B\n" +
            "U0121 perso la comunicazione con antibloccaggio freni System (ABS) Modulo di controllo\n" +
            "U0122 perso la comunicazione con la dinamica del veicolo modulo di controllo\n" +
            "U0123 perso la comunicazione con sensore di velocità d'imbardata modulo\n" +
            "U0124 perso la comunicazione con sensore di accelerazione laterale modulo\n" +
            "U0125 perso la comunicazione con multi-asse modulo sensore di accelerazione\n" +
            "U0126 perso la comunicazione con sensore angolo sterzo modulo\n" +
            "U0127 perso la comunicazione con i monitor della pressione dei pneumatici modulo\n" +
            "U0128 perso la comunicazione con parco modulo di controllo freno\n" +
            "U0129 perso la comunicazione con sistema di frenatura del modulo di controllo\n" +
            "U0130 perso la comunicazione con sterzo modulo di controllo\n" +
            "U0131 perso la comunicazione con governo di potere di controllo del modulo\n" +
            "U0132 perso la comunicazione con controllo di livello Ride modulo\n" +
            "U0140 perso la comunicazione con il modulo di controllo del corpo\n" +
            "U0141 perso la comunicazione con organo di controllo Modulo A\n" +
            "U0142 perso la comunicazione con organo di controllo modulo B\n" +
            "U0143 perso la comunicazione con organo di controllo modulo C\n" +
            "U0144 perso la comunicazione con organo di controllo modulo D\n" +
            "U0145 perso la comunicazione con organo di controllo Modulo E\n" +
            "U0146 perso la comunicazione con un gateway\n" +
            "U0147 perso la comunicazione con i gateway B\n" +
            "U0148 perso la comunicazione con i gateway C\n" +
            "U0149 perso la comunicazione con i gateway D\n" +
            "U0150 perso la comunicazione con i gateway E\n" +
            "U0151 perso la comunicazione con le restrizioni di controllo modulo\n" +
            "U0152 perso la comunicazione con restrizioni lato modulo di controllo (a sinistra)\n" +
            "U0153 perso la comunicazione con restrizioni lato modulo di controllo (a destra)\n" +
            "U0154 perso la comunicazione con le restrizioni di rilevamento degli occupanti modulo di controllo\n" +
            "U0155 perso la comunicazione con cruscotto di cluster (IPC) Modulo di controllo\n" +
            "U0156 perso la comunicazione con un centro informazioni\n" +
            "U0157 perso la comunicazione con informazioni Centro B\n" +
            "U0158 perso la comunicazione con testa fino display\n" +
            "U0159 perso la comunicazione con parcheggio assistere modulo di controllo\n" +
            "U0160 perso la comunicazione con il controllo acustico di avviso modulo\n" +
            "U0161 perso la comunicazione con bussola modulo\n" +
            "U0162 perso la comunicazione con i display di navigazione modulo\n" +
            "U0163 perso la comunicazione con il modulo di controllo della navigazione\n" +
            "U0164 perso la comunicazione con il modulo di controllo HVAC\n" +
            "U0165 perso la comunicazione con il modulo di controllo HVAC (posteriore)\n" +
            "U0166 perso la comunicazione con riscaldamento ausiliario di controllo modulo\n" +
            "U0167 perso la comunicazione con immobilizzatore del veicolo modulo di controllo\n" +
            "U0168 perso veicolo di comunicazione con il modulo di controllo di sicurezza\n" +
            "U0169 perso la comunicazione con il tetto apribile modulo di controllo\n" +
            "U0170 perso la comunicazione con \"restrizioni Un sistema di sensori\"\n" +
            "U0171 perso la comunicazione con \"sistema di ritenuta per sensore B\"\n" +
            "U0172 perso la comunicazione con \"sistema di ritenuta per sensore C\"\n" +
            "U0173 perso la comunicazione con \"sistema di ritenuta per sensore D\"\n" +
            "U0174 perso la comunicazione con \"sistema di ritenuta per sensore E\"\n" +
            "U0175 perso la comunicazione con \"sistema di ritenuta per sensore F\"\n" +
            "U0176 perso la comunicazione con \"sistema di ritenuta per sensore G\"\n" +
            "U0177 perso la comunicazione con \"sistema di ritenuta per sensore H\"\n" +
            "U0178 perso la comunicazione con \"sistema di ritenuta per sensore I\"\n" +
            "U0179 perso la comunicazione con \"sistema di ritenuta per sensore J\"\n" +
            "U0180 perso la comunicazione con il controllo automatico di illuminazione modulo\n" +
            "U0181 perso la comunicazione con proiettore livellamento modulo di controllo\n" +
            "U0182 perso la comunicazione con il modulo di comando di luci (anteriore)\n" +
            "U0183 perso la comunicazione con il modulo di comando di luci (posteriore)\n" +
            "U0184 perso la comunicazione con radio\n" +
            "U0185 perso la comunicazione con antenna modulo di controllo\n" +
            "U0186 perso la comunicazione con amplificatore audio\n" +
            "U0187 perso di comunicazione digitale con disco lettore / changer modulo A\n" +
            "U0188 perso di comunicazione digitale con disco lettore / changer modulo B\n" +
            "U0189 perso di comunicazione digitale con disco lettore / changer modulo C\n" +
            "U0190 perso di comunicazione digitale con disco lettore / changer modulo D\n" +
            "U0191 perso la comunicazione con la televisione\n" +
            "U0192 perso la comunicazione con i personal computer\n" +
            "U0193 perso la comunicazione con \"controllo audio digitale Modulo A\"\n" +
            "U0194 perso la comunicazione con \"l'audio digitale di controllo modulo B\"\n" +
            "U0195 perso la comunicazione con la sottoscrizione del modulo di intrattenimento ricevitore\n" +
            "U0196 perso la comunicazione con i sedili posteriori di intrattenimento modulo di controllo\n" +
            "U0197 perso la comunicazione con telefono modulo di controllo\n" +
            "U0198 perso la comunicazione con il modulo di controllo telematico\n" +
            "U0199 perso la comunicazione con \"porte di controllo Modulo A\"\n" +
            "U0200 perso la comunicazione con \"porte di controllo modulo B\"\n" +
            "U0201 perso la comunicazione con \"porte di controllo Modulo C\"\n" +
            "U0202 perso la comunicazione con \"porte di controllo modulo D\"\n" +
            "U0203 perso la comunicazione con i \"porta di controllo del modulo E\"\n" +
            "U0204 perso la comunicazione con \"porte di controllo modulo F\"\n" +
            "U0205 perso la comunicazione con \"porte di controllo modulo G\"\n" +
            "U0206 perso la comunicazione con i top pieghevole modulo di controllo\n" +
            "U0207 perso la comunicazione con i mobili di controllo del modulo tetto\n" +
            "U0208 perso la comunicazione con \"controllo del sedile del modulo A\"\n" +
            "U0209 perso la comunicazione con \"controllo del sedile del modulo B\"\n" +
            "U0210 perso la comunicazione con \"controllo del sedile del modulo C\"\n" +
            "U0211 perso la comunicazione con \"controllo del sedile del modulo D\"\n" +
            "U0212 perso la comunicazione con colonna dello sterzo modulo di controllo\n" +
            "U0213 perso la comunicazione con specchio modulo di controllo\n" +
            "U0214 perso la comunicazione con funzione di azionamento a distanza\n" +
            "U0215 perso la comunicazione con \"porte switch A\"\n" +
            "U0216 perso la comunicazione con \"porte switch B\"\n" +
            "U0217 perso la comunicazione con \"porte switch C\"\n" +
            "U0218 perso la comunicazione con \"porte switch D\"\n" +
            "U0219 perso la comunicazione con \"porte switch E\"\n" +
            "U0220 perso la comunicazione con \"porte switch F\"\n" +
            "U0221 perso la comunicazione con \"porte switch G\"\n" +
            "U0222 perso la comunicazione con i \"porta finestra Un motore\"\n" +
            "U0223 perso la comunicazione con i \"porta finestra motore B\"\n" +
            "U0224 perso la comunicazione con i \"porta finestra a motore C\"\n" +
            "U0225 perso la comunicazione con i \"porta finestra motore D\"\n" +
            "U0226 perso la comunicazione con i \"porta finestra motore E\"\n" +
            "U0227 perso la comunicazione con i \"porta finestra motore F\"\n" +
            "U0228 perso la comunicazione con i \"porta finestra motore G\"\n" +
            "U0229 perso la comunicazione con volante riscaldato modulo\n" +
            "U0230 perso la comunicazione con cancello posteriore del modulo\n" +
            "U0231 perso la comunicazione con pioggia modulo di rilevamento\n" +
            "U0232 perso la comunicazione con lato di rilevamento ostacolo modulo di controllo (a sinistra)\n" +
            "U0233 perso la comunicazione con lato di rilevamento ostacolo modulo di controllo (a destra)\n" +
            "U0234 perso la comunicazione con comodo ricordare modulo\n" +
            "U0235 perso la comunicazione con controllo della velocità di crociera fronte gamma di sensori a distanza\n" +
            "U0300 di controllo interno modulo software incompatibilità\n" +
            "U0301 incompatibilità con il software ECM / PCM\n" +
            "U0302 software incompatibilità con la trasmissione del modulo di controllo\n" +
            "U0303 incompatibilità con il software caso di trasferimento di controllo modulo\n" +
            "U0304 software incompatibilità con cambio modulo di controllo\n" +
            "U0305 incompatibilità con il software di controllo di crociera modulo\n" +
            "U0306 software incompatibilità con iniettore di combustibile modulo di controllo\n" +
            "U0307 software incompatibilità con candela di preriscaldo modulo di controllo\n" +
            "U0308 incompatibilità con il software del gas attuatore modulo di controllo\n" +
            "U0309 software incompatibilità con carburanti alternativi modulo di controllo\n" +
            "U0310 incompatibilità con il software di controllo delle pompe di carburante modulo\n" +
            "U0311 software incompatibilità con motore modulo di controllo\n" +
            "U0312 software incompatibilità con l'energia della batteria di controllo Modulo A\n" +
            "U0313 software incompatibilità con l'energia della batteria di controllo modulo B\n" +
            "U0314 software incompatibilità con quattro ruote motrici modulo di controllo della frizione\n" +
            "U0315 incompatibilità con software anti-sistema di frenatura del modulo di controllo\n" +
            "U0316 software incompatibilità con le dinamiche del veicolo modulo di controllo\n" +
            "U0317 software incompatibilità con parco modulo di controllo freno\n" +
            "U0318 incompatibilità con il software del sistema di controllo del freno modulo\n" +
            "U0319 incompatibilità con il software di sterzo modulo di controllo\n" +
            "U0320 incompatibilità con il software Power Steering modulo di controllo\n" +
            "U0321 incompatibilità con il software Ride livello di controllo modulo\n" +
            "U0322 incompatibilità con il software di controllo del corpo modulo\n" +
            "U0323 incompatibilità con il software del pannello di controllo strumento modulo\n" +
            "U0324 incompatibilità con il software di controllo modulo HVAC\n" +
            "U0325 incompatibilità con il software di riscaldamento ausiliario di controllo modulo\n" +
            "U0326 software incompatibilità con immobilizzatore del veicolo modulo di controllo\n" +
            "U0327 incompatibilità con il software di controllo di sicurezza dei veicoli modulo\n" +
            "U0328 software incompatibilità con sensore angolo sterzo modulo\n" +
            "U0329 software incompatibilità con colonna dello sterzo modulo di controllo\n" +
            "U0330 incompatibilità con il software di controllo della pressione pneumatico modulo\n" +
            "U0331 incompatibilità con il software organismo di controllo Modulo A\n" +
            "U0400 dati non validi ricevuti\n" +
            "U0401 dati non validi ricevuti da ECM / PCM\n" +
            "U0402 dati non validi ricevuti dal modulo di controllo di trasmissione\n" +
            "U0403 dati non validi ricevuti dal caso di trasferimento di controllo modulo\n" +
            "U0404 dati non validi ricevuti dal cambio di controllo modulo\n" +
            "U0405 dati non validi ricevuti dal modulo di controllo della velocità di crociera\n" +
            "U0406 dati non validi ricevuti dal combustibile iniettore modulo di controllo\n" +
            "U0407 dati non validi ricevuti dal candela di preriscaldo modulo di controllo\n" +
            "U0408 dati non validi ricevuti dal gas attuatore modulo di controllo\n" +
            "U0409 dati non validi ricevuti da carburante alternativo modulo di controllo\n" +
            "U0410 dati non validi ricevuti da pompa di combustibile modulo di controllo\n" +
            "U0411 dati non validi ricevuti dal motore di controllo modulo\n" +
            "U0412 dati non validi ricevuti da batteria energia controllo modulo A\n" +
            "U0413 dati non validi ricevuti da batteria energia controllo modulo B\n" +
            "U0414 dati non validi ricevuti da quattro ruote motrici modulo di controllo della frizione\n" +
            "U0415 dati non validi ricevuti da antibloccaggio freni modulo di controllo del sistema\n" +
            "U0416 dati non validi ricevuti dal veicolo dinamica modulo di controllo\n" +
            "U0417 dati non validi ricevuti dal parco modulo di controllo freno\n" +
            "U0418 dati non validi ricevuti dal sistema di controllo del freno modulo\n" +
            "U0419 dati non validi ricevuti dal comitato direttivo di controllo dello sforzo modulo\n" +
            "U0420 dati non validi ricevuti dal governo di potere di controllo del modulo\n" +
            "U0421 dati non validi ricevuti da cavalcare modulo di controllo livello\n" +
            "U0422 dati non validi ricevuti dal corpo del modulo di controllo\n" +
            "U0423 dati non validi ricevuti dal pannello di controllo strumento modulo\n" +
            "U0424 dati non validi ricevuti dal modulo di controllo HVAC\n" +
            "U0425 dati non validi ricevuti dal riscaldamento ausiliario di controllo modulo\n" +
            "U0426 dati non validi ricevuti dal veicolo immobilizzatore modulo di controllo\n" +
            "U0427 dati non validi ricevuti dal veicolo modulo di controllo di sicurezza\n" +
            "U0428 dati non validi ricevuti dal sensore angolo sterzo modulo\n" +
            "U0429 dati non validi ricevuti da colonna dello sterzo modulo di controllo\n" +
            "U0430 dati non validi ricevuti dal pneumatico modulo di controllo della pressione\n" +
            "U0431 dati non validi ricevuti da organismo di controllo Modulo A\n" +
            "U1000 non validi o mancanti di dati primari id\n" +
            "U1001 non validi o mancanti di dati primari id\n" +
            "U1002 non validi o mancanti di dati primari id\n" +
            "U1003 non validi o mancanti di dati primari id\n" +
            "U1004 non validi o mancanti dei dati di programmazione per la CEE\n" +
            "U1005 non validi o mancanti dei dati di programmazione per la CEE\n" +
            "U1006 non validi o mancanti di dati primari id\n" +
            "U1007 non validi o mancanti di dati primari id\n" +
            "U1008 non validi o mancanti dei dati per la coppia del motore\n" +
            "U1009 non validi o mancanti dei dati per la coppia del motore\n" +
            "U1010 non validi o mancanti dei dati per l'aria di aspirazione del motore\n" +
            "U1011 non validi o mancanti dei dati per l'aria di aspirazione del motore\n" +
            "U1012 non validi o mancanti di dati primari id\n" +
            "U1013 non validi o mancanti di dati primari id\n" +
            "U1014 non validi o mancanti di dati primari id\n" +
            "U1015 non validi o mancanti di dati primari id\n" +
            "U1016 non validi o mancanti di dati primari id\n" +
            "U1017 non validi o mancanti di dati primari id\n" +
            "U1018 non validi o mancanti di dati gas\n" +
            "U1019 non validi o mancanti di dati gas\n" +
            "U1020 non validi o mancanti dei dati per l'aria condizionata frizione\n" +
            "U1021 non validi o mancanti dei dati per l'aria condizionata frizione\n" +
            "U1022 non validi o mancanti di dati primari id\n" +
            "U1023 non validi o mancanti di dati primari id\n" +
            "U1024 non validi o mancanti di dati primari id\n" +
            "U1025 non validi o mancanti di dati primari id\n" +
            "U1026 non validi o mancanti di dati del motore giri / min\n" +
            "U1027 non validi o mancanti di dati del motore giri / min\n" +
            "U1028 non validi o mancanti di dati primari id\n" +
            "U1029 non validi o mancanti di dati primari id\n" +
            "U1030 non valido o mancante di dati a fini sperimentali # 1\n" +
            "U1031 non valido o mancante di dati a fini sperimentali # 1\n" +
            "U1032 non validi o mancanti di dati primari id\n" +
            "U1033 non validi o mancanti di dati primari id\n" +
            "U1034 non validi o mancanti di dati primari id\n" +
            "U1035 non validi o mancanti di dati primari id\n" +
            "U1036 non validi o mancanti dei dati per le ruote\n" +
            "U1037 non validi o mancanti dei dati per le ruote\n" +
            "U1038 non validi o mancanti di dati primari id\n" +
            "U1039 non validi o mancanti di dati primari id / velocità del veicolo\n" +
            "U1040 non validi o mancanti dei dati per la velocità del veicolo\n" +
            "U1041 non validi o mancanti dei dati per la velocità del veicolo\n" +
            "U1042 non validi o mancanti dei dati per il controllo di trazione\n" +
            "U1043 non validi o mancanti dei dati per il controllo di trazione\n" +
            "U1044 non validi o mancanti dei dati per la trazione a motore\n" +
            "U1045 non validi o mancanti dei dati per la trazione a motore\n" +
            "U1046 non validi o mancanti di dati primari id\n" +
            "U1047 non validi o mancanti di dati primari id\n" +
            "U1048 non validi o mancanti di dati primari id\n" +
            "U1049 non validi o mancanti di dati primari id\n" +
            "U1050 non validi o mancanti di dati per i freni\n" +
            "U1051 non validi o mancanti di dati per i freni\n" +
            "U1052 non validi o mancanti dei dati per sterzo / volante\n" +
            "U1053 non validi o mancanti dei dati per sterzo / volante\n" +
            "U1054 non validi o mancanti di dati primari id\n" +
            "U1055 non validi o mancanti di dati primari id\n" +
            "U1056 non validi o mancanti dei dati di configurazione per il veicolo\n" +
            "U1057 non validi o mancanti dei dati di configurazione per il veicolo\n" +
            "U1058 mancante o non valido per la trasmissione dati / Transaxle / PRNDL\n" +
            "U1059 mancante o non valido per la trasmissione dati / Transaxle / PRNDL\n" +
            "U1060 non validi o mancanti di dati primari id\n" +
            "U1061 non validi o mancanti di dati primari id\n" +
            "U1062 non validi o mancanti di dati primari id\n" +
            "U1063 non validi o mancanti di dati primari id\n" +
            "U1064 non validi o mancanti di dati primari id\n" +
            "U1065 non validi o mancanti di dati primari id\n" +
            "U1066 non validi o mancanti di dati primari id\n" +
            "U1067 non validi o mancanti di dati primari id\n" +
            "U1068 non validi o mancanti di dati primari id\n" +
            "U1069 non validi o mancanti di dati primari id\n" +
            "U1070 non validi o mancanti di dati per sensori motore\n" +
            "U1071 non validi o mancanti di dati per sensori motore\n" +
            "U1072 non validi o mancanti dei dati per liquido di raffreddamento del motore\n" +
            "U1073 non validi o mancanti dei dati per liquido di raffreddamento del motore\n" +
            "U1074 non validi o mancanti dei dati per olio motore\n" +
            "U1075 non validi o mancanti dei dati per olio motore temp\n" +
            "U1076 non validi o mancanti di dati primari id\n" +
            "U1077 non validi o mancanti di dati primari id\n" +
            "U1078 non validi o mancanti di dati primari id\n" +
            "U1079 non validi o mancanti di dati primari id\n" +
            "U1080 non validi o mancanti di dati primari id\n" +
            "U1081 non validi o mancanti di dati primari id\n" +
            "U1082 non validi o mancanti dei dati per altri sistemi motore\n" +
            "U1083 non validi o mancanti dei dati per altri sistemi motore\n" +
            "U1084 non validi o mancanti dei dati per Powertrain status richiesta\n" +
            "U1085 non validi o mancanti dei dati per Powertrain status richiesta\n" +
            "U1086 non validi o mancanti di dati primari id\n" +
            "U1087 non validi o mancanti di dati primari id\n" +
            "U1088 non validi o mancanti dei dati per la sospensione\n" +
            "U1089 non validi o mancanti dei dati per la sospensione\n" +
            "U1090 non validi o mancanti di dati per non legiferato diagnostica\n" +
            "U1091 non validi o mancanti di dati per non legiferato diagnostica\n" +
            "U1092 non validi o mancanti di dati primari id\n" +
            "U1093 non validi o mancanti di dati primari id\n" +
            "U1094 non valido o mancante di dati a fini sperimentali # 2\n" +
            "U1095 non valido o mancante di dati a fini sperimentali # 2\n" +
            "U1096 non validi o mancanti di dati primari id\n" +
            "U1097 non validi o mancanti di dati primari id\n" +
            "U1098 non validi o dati mancanti per il veicolo di controllo della velocità\n" +
            "U1099 non validi o dati mancanti per il veicolo di controllo della velocità\n" +
            "U1100 non validi o mancanti di dati primari id\n" +
            "U1101 non validi o mancanti di dati primari id\n" +
            "U1102 non validi o mancanti di dati primari id\n" +
            "U1103 non validi o mancanti di dati primari id\n" +
            "U1104 non validi o mancanti di dati per i telai status richiesta\n" +
            "U1105 non validi o mancanti di dati per i telai status richiesta\n" +
            "U1106 non validi o mancanti dei dati legiferato per la diagnostica\n" +
            "U1107 non validi o mancanti dei dati legiferato per la diagnostica\n" +
            "U1108 non valido o mancante di dati per trazione elettrica Drive (Inverter)\n" +
            "U1109 non valido o mancante di dati per trazione elettrica Drive (Inverter)\n" +
            "U1110 non validi o mancanti di dati primari id\n" +
            "U1111 non validi o mancanti di dati primari id\n" +
            "U1112 non validi o mancanti di dati primari id\n" +
            "U1113 non validi o mancanti di dati primari id\n" +
            "U1114 non validi o mancanti dei dati per sistema di tariffazione\n" +
            "U1115 non validi o mancanti dei dati per sistema di tariffazione\n" +
            "U1116 non validi o mancanti dei dati per la gestione di energia elettrica\n" +
            "U1117 non validi o mancanti dei dati per la gestione di energia elettrica\n" +
            "U1118 non validi o mancanti di dati primari id\n" +
            "U1119 non validi o mancanti di dati primari id\n" +
            "U1120 non validi o mancanti di dati primari id\n" +
            "U1121 non validi o mancanti di dati primari id\n" +
            "U1122 non validi o mancanti dei dati per contachilometri\n" +
            "U1123 non validi o mancanti dei dati per contachilometri\n" +
            "U1124 non validi o mancanti di dati primari id\n" +
            "U1125 non validi o mancanti di dati primari id\n" +
            "U1126 non validi o mancanti di dati primari id\n" +
            "U1127 non validi o mancanti di dati primari id\n" +
            "U1128 non validi o mancanti di dati primari id\n" +
            "U1129 non validi o mancanti di dati primari id\n" +
            "U1130 non validi o mancanti dei dati per il sistema di alimentazione\n" +
            "U1131 non validi o mancanti dei dati per il sistema di alimentazione\n" +
            "U1132 non validi o mancanti di dati per veicoli movimento\n" +
            "U1133 non validi o mancanti di dati per veicoli movimento\n" +
            "U1134 non validi o mancanti dei dati per passare accensione / Starter\n" +
            "U1135 non validi o mancanti dei dati per passare accensione / Starter\n" +
            "U1136 non validi o mancanti dei dati per spie\n" +
            "U1137 non validi o mancanti dei dati per spie\n" +
            "U1138 non validi o mancanti di dati primari id\n" +
            "U1139 non validi o mancanti di dati primari id\n" +
            "U1140 non validi o mancanti dei dati per gateway\n" +
            "U1141 non validi o mancanti dei dati per gateway\n" +
            "U1142 non validi o mancanti di dati primari id\n" +
            "U1143 non validi o mancanti di dati primari id\n" +
            "U1144 non validi o mancanti di dati primari id\n" +
            "U1145 non validi o mancanti di dati primari id\n" +
            "U1146 non validi o mancanti di dati di sicurezza per veicoli\n" +
            "U1147 non validi o mancanti di dati di sicurezza per veicoli\n" +
            "U1148 non validi o mancanti dei dati per il controllo audio\n" +
            "U1149 non validi o mancanti dei dati per il controllo audio\n" +
            "U1150 non validi o mancanti di dati acustici per le avvertenze\n" +
            "U1151 non validi o mancanti di dati acustici per le avvertenze\n" +
            "U1152 non valido o mancante di dati a fini sperimentali # 3\n" +
            "U1153 non valido o mancante di dati a fini sperimentali # 3\n" +
            "U1154 non validi o mancanti dei dati per compact disc\n" +
            "U1155 non validi o mancanti dei dati per compact disc\n" +
            "U1156 non validi o mancanti dei dati per l'elaborazione del segnale digitale\n" +
            "U1157 non validi o mancanti dei dati per l'elaborazione del segnale digitale\n" +
            "U1158 non validi o mancanti dei dati per antenna\n" +
            "U1159 non validi o mancanti dei dati per antenna\n" +
            "U1160 non validi o mancanti di dati primari id\n" +
            "U1161 non validi o mancanti di dati primari id\n" +
            "U1162 non validi o mancanti dei dati per Digital Audio Tape\n" +
            "U1163 non validi o mancanti dei dati per Digital Audio Tape\n" +
            "U1164 non valido o mancante di dati per sintonizzatore / ricevitore\n" +
            "U1165 non valido o mancante di dati per sintonizzatore / ricevitore\n" +
            "U1166 non validi o mancanti dei dati per cassetta\n" +
            "U1167 non validi o mancanti dei dati per cassetta\n" +
            "U1168 non validi o mancanti di dati primari id\n" +
            "U1169 non validi o mancanti di dati primari id\n" +
            "U1170 non validi o mancanti dei dati per telefono cellulare / sistema di paginazione\n" +
            "U1171 non validi o mancanti dei dati per telefono cellulare / sistema di paginazione\n" +
            "U1172 non validi o mancanti dei dati per il controllo remoto pulsante\n" +
            "U1173 non validi o mancanti dei dati per il controllo remoto pulsante\n" +
            "U1174 non validi o mancanti di dati primari id\n" +
            "U1175 non validi o mancanti di dati primari id\n" +
            "U1176 non validi o mancanti di dati primari id\n" +
            "U1177 non validi o mancanti di dati primari id\n" +
            "U1178 non valido o mancante dei dati climatici per il controllo delle malattie (HVAC)\n" +
            "U1179 non valido o mancante dei dati climatici per il controllo delle malattie (HVAC)\n" +
            "U1180 non valido o mancante di dati per la personalizzazione (Memoria) Caratteristiche\n" +
            "U1181 non valido o mancante di dati per la personalizzazione (Memoria) Caratteristiche\n" +
            "U1182 non validi o mancanti di dati primari id\n" +
            "U1183 non validi o mancanti di dati primari id\n" +
            "U1184 non validi o mancanti dei dati per finestra tergicristallo / Lavatrice\n" +
            "U1185 non validi o mancanti dei dati per finestra tergicristallo / Lavatrice\n" +
            "U1186 non validi o mancanti di dati primari id\n" +
            "U1187 non validi o mancanti di dati primari id\n" +
            "U1188 non validi o mancanti di dati primari id\n" +
            "U1189 non validi o mancanti di dati primari id\n" +
            "U1190 non validi o mancanti di dati primari id\n" +
            "U1191 non validi o mancanti di dati primari id\n" +
            "U1192 non validi o mancanti di dati primari id\n" +
            "U1193 non validi o mancanti di dati primari id\n" +
            "U1194 non validi o mancanti dei dati di specchi\n" +
            "U1195 non validi o mancanti dei dati di specchi\n" +
            "U1196 non validi o mancanti dei dati per porte chiuse\n" +
            "U1197 non validi o mancanti dei dati per porte chiuse\n" +
            "U1198 non valido o mancante di dati per l'accesso esterno (porte)\n" +
            "U1199 non valido o mancante di dati per l'accesso esterno (porte)\n" +
            "U1200 non validi o mancanti dei dati seggio per moto / controllo\n" +
            "U1201 non validi o mancanti dei dati seggio per moto / controllo\n" +
            "U1202 non validi o mancanti di dati per Windows\n" +
            "U1203 non validi o mancanti di dati per Windows\n" +
            "U1204 non validi o mancanti dei dati per colonna dello sterzo\n" +
            "U1205 non validi o mancanti dei dati per colonna dello sterzo\n" +
            "U1206 non validi o mancanti di dati primari id\n" +
            "U1207 non validi o mancanti di dati primari id\n" +
            "U1208 non validi o mancanti dei dati seggio per interruttori\n" +
            "U1209 non validi o mancanti dei dati seggio per interruttori\n" +
            "U1210 non validi o mancanti dei dati per le restrizioni\n" +
            "U1211 non validi o mancanti dei dati per le restrizioni\n" +
            "U1212 non validi o mancanti di dati primari id\n" +
            "U1213 non validi o mancanti di dati primari id\n" +
            "U1214 non validi o mancanti di dati primari id\n" +
            "U1215 non validi o mancanti di dati primari id\n" +
            "U1216 non validi o mancanti di dati esterni per lampada interruzione\n" +
            "U1217 non validi o mancanti di dati esterni per lampada interruzione\n" +
            "U1218 non validi o mancanti di dati esterni per lampade\n" +
            "U1219 non validi o mancanti di dati esterni per lampade\n" +
            "U1220 non validi o mancanti di dati interni lampada interruzione\n" +
            "U1221 non validi o mancanti di dati interni lampada interruzione\n" +
            "U1222 non validi o mancanti dei dati interni per lampade\n" +
            "U1223 non validi o mancanti dei dati interni per lampade\n" +
            "U1224 non validi o mancanti di dati primari id\n" +
            "U1225 non validi o mancanti di dati primari id\n" +
            "U1226 non validi o dati mancanti per il corpo status richiesta\n" +
            "U1227 non validi o dati mancanti per il corpo status richiesta\n" +
            "U1228 non validi o mancanti dei dati per pneumatici\n" +
            "U1229 non validi o mancanti dei dati per pneumatici\n" +
            "U1230 non validi o mancanti dei dati per sbrinamento elettrico\n" +
            "U1231 non validi o mancanti dei dati per sbrinamento elettrico\n" +
            "U1232 non validi o mancanti dei dati per la navigazione\n" +
            "U1233 non validi o mancanti dei dati per la navigazione\n" +
            "U1234 non validi o mancanti di dati visualizza\n" +
            "U1235 non validi o mancanti di dati visualizza\n" +
            "U1236 non validi o mancanti dei dati per memoria\n" +
            "U1237 non validi o mancanti dei dati per memoria\n" +
            "U1238 non valido o mancante di dati a fini sperimentali # 4\n" +
            "U1239 non valido o mancante di dati a fini sperimentali # 4\n" +
            "U1240 non validi o mancanti di dati primari id\n" +
            "U1241 non validi o mancanti di dati primari id\n" +
            "U1242 non validi o dati mancanti per l'ambiente esterno\n" +
            "U1243 non validi o dati mancanti per l'ambiente esterno\n" +
            "U1244 non validi o dati mancanti per l'ambiente interno\n" +
            "U1245 non validi o dati mancanti per l'ambiente interno\n" +
            "U1246 non validi o mancanti di dati primari id\n" +
            "U1247 non validi o mancanti di dati primari id\n" +
            "U1248 non valido o mancante di dati per Time / Date\n" +
            "U1249 non valido o mancante di dati per Time / Date\n" +
            "U1250 non valido o mancante di dati per ID del veicolo (VIN)\n" +
            "U1251 non valido o mancante di dati per ID del veicolo (VIN)\n" +
            "U1252 non validi o mancanti dei dati per le funzioni di classe A\n" +
            "U1253 non validi o mancanti dei dati per le funzioni di classe A\n" +
            "U1254 non validi o mancanti dei dati per rete di controllo\n" +
            "U1255 non validi o mancanti dei dati per rete di controllo\n" +
            "U1260 unico scadute (+) Circuito di mancata\n" +
            "U1261 unico scadute (-) Mancata Circuito\n" +
            "U1262 comunicazione autobus colpa\n" +
            "U1308 non validi o mancanti di dati per leggere funzione della coppia motore\n" +
            "U1341 non validi o mancanti dei dati per la funzione di leggere la velocità del veicolo\n" +
            "U1430 non validi o mancanti di dati per leggere funzione il sistema di alimentazione\n" +
            "U1451 non validi o mancanti dei dati per la funzione di leggere le avvertenze udibile / anti-furto modulo, veicolo immobilizzato\n" +
            "U1612 mancanza di riconoscimento per id primaria\n" +
            "U1736 Mancanza di Riconoscimento per spie\n" +
            "U1750 mancanza di riconoscimento per udibili le avvertenze\n" +
            "U1794 Mancanza di Riconoscimento per Specchi\n" +
            "U1797 mancanza di riconoscimento per i bloccoporta\n" +
            "U1798 Mancanza di Riconoscimento per l'accesso esterno (porte)\n" +
            "U1806 mancanza di riconoscimento per id primaria\n" +
            "U1900 POSSONO comunicazione autobus colpa\n" +
            "U1950 UPB comunicazione autobus colpa\n" +
            "U2000 audio posteriore unità di controllo non risponde\n" +
            "U2001 piastra di registrazione audio unità non risponde\n" +
            "U2002 audio lunetta non risponde\n" +
            "U2003 audio compact disk / unità disco fantino non risponde\n" +
            "U2004 audio volante unità di controllo non risponde\n" +
            "U2005 audio posteriore del pannello di controllo integrato di unità non risponde\n" +
            "U2006 audio remoto unità di controllo del clima non risponde\n" +
            "U2007 audio unità di navigazione non risponde\n" +
            "U2008 audio telefono non risponde\n" +
            "U2009 audio frontale del modulo di controllo (ACM) non risponde\n" +
            "U2010 modulo non risponde (non SCP)\n" +
            "U2011 modulo trasmesso dati non validi (non SCP)\n" +
            "U2012 autobus errore di comunicazione (non SCP)\n" +
            "U2013 Compass modulo non risponde\n" +
            "U2014 audio subwoofer unità non risponde\n" +
            "U2015 segnale link colpa (non SCP)\n" +
            "U2016 segnale breve collegamento a terra (non SCP) / modulo da NGV\n" +
            "U2017 driver lato sensore crash comunicazione colpa (non SCP)\n" +
            "U2018 lato passeggero sensore di crash comunicazione colpa (non SCP)\n" +
            "U2019 audio vocale modulo non risponde\n" +
            "U2020 Audio Center Amp non risponde\n" +
            "U2021 Non valide / colpa dati ricevuti (non SCP)\n" +
            "U2150 dati non validi da REM\n" +
            "U2152 dati non validi da gemma\n" +
            "U2160 dati non validi da IC\n" +
            "U2195 dati non validi da SCLM\n" +
            "U2500 (CAN) la mancanza di riconoscimento da motore di gestione";

    public static String getError(String e)
    {
        String error="";
        int index1 = P0A00P0AD3.indexOf(e);
        int index2 = P0000P04AB.indexOf(e);
        int index3 = P0500P0999.indexOf(e);
        int index4 = P2000P245D.indexOf(e);
        int index5 = P2500P2A11.indexOf(e);
        int index6 = P3400P3497.indexOf(e);
        int index7 = C0000C2767.indexOf(e);
        int index8 = B1200B1699.indexOf(e);
        int index9 = B1700B2606.indexOf(e);
        int index10 = U0001U2500.indexOf(e);
        if (index1>0)
        {
            error = taglia(index1, P0A00P0AD3);
        }
        else if (index2>0)
        {
            error = taglia(index2, P0000P04AB);
        }
        else if (index3>0)
        {
            error = taglia(index3, P0500P0999);
        }
        else if (index4>0)
        {
            error = taglia(index4, P2000P245D);
        }
        else if (index5>0)
        {
            error = taglia(index5, P2500P2A11);
        }
        else if (index6>0)
        {
            error = taglia(index6, P3400P3497);
        }
        else if (index7>0)
        {
            error = taglia(index7, C0000C2767);
        }
        else if (index8>0)
        {
            error = taglia(index8, B1200B1699);
        }
        else if (index9>0)
        {
            error = taglia(index9, B1700B2606);
        }
        else if (index10>10)
        {
            error = taglia(index10, U0001U2500);
        }
        else
            error = "Codice "+ e +" non presente nel database, cercalo su internet per maggiori informazioni";
        return error;
    }

    public static String taglia(int index, String s)
    {
        String err = s.substring(index);
        err = err.substring(0, err.indexOf("\n"));
        return err;
    }
}
