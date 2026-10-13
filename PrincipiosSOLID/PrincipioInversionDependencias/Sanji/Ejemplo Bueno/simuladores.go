package main

import (
	"errors"
	"fmt"
)

type SimuladorPasarela struct {
	DebeFallar bool
}

func (sp *SimuladorPasarela) Cobrar(monto float64) error {
	if sp.DebeFallar {
		return errors.New("Fondos Insuficientes")
	}

	fmt.Printf("Cobro realizado por el monto %.2f\n", monto)
	return nil
}

type SimuladorEmisor struct{}

func (se *SimuladorEmisor) Enviar(monto float64, correo string) error {
	fmt.Printf("[SimulaforEmisor] Comprobante enviado al correo %s, por el monto de %.2f\n", correo, monto)
	return nil
}
