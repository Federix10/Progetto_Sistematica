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

    /*public static void WriteCode(Context context)
    {
        try {
            FileOutputStream fOut = context.openFileOutput("errorCode.txt", MODE_PRIVATE);
            fOut.write(error.getBytes());
            fOut.close();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }*/

    public static String getError(String e)
    {
        String error="";
        int index1 = P0A00P0AD3.indexOf(e);
        int index2 = P0000P04AB.indexOf(e);
        int index3 = P0500P0999.indexOf(e);
        int index4 = P2000P245D.indexOf(e);
        int index5 = P2500P2A11.indexOf(e);
        int index6 = P3400P3497.indexOf(e);
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
        else
            error = "Codice non presente nel database, cercalo su internet per maggiori informazioni";
        return error;
    }

    public static String taglia(int index, String s)
    {
        String err = s.substring(index);
        err = err.substring(0, err.indexOf("\n"));
        return err;
    }
}
