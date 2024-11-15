export interface Bus {
  idBus: number;
  numero_bus: string;
  placa: string;
  fecha_creacion: string;
  caracteristicas: string;
  idMarca_bus: number;
  actividad: boolean;
}

export interface PagedResponse<T> {
  content: T[];
  totalElements: number;
  totalPages: number;
  pageSize: number;
  pageNumber: number;
}

/*ESTA FUNCION ES PARA MOSTRAR TODOS LOS BUSES TOTALES, PERO SE USO 
LA OTRA FUNCION QUE PERMITE LLAMAR A LOS BUSES Y LA PAGINACION*/
export async function fetchBus(): Promise<Bus[]> {
  try {
    const response = await fetch("http://localhost:8080/bus");
    if (!response.ok) {
      throw new Error("Hubo un error en la respuesta");
    }
    const data: Bus[] = await response.json();
    return data;
  } catch (error) {
    console.error("Error al obtener los buses:", error);
    throw error;
  }
}


/*FUNCION DE BUSES Y PAGINACION */
export async function fetchPagedBuses(
  page: number,
  size: number
): Promise<PagedResponse<Bus>> {
  try {
    const response = await fetch(
      `http://localhost:8080/bus/paginacion?page=${page}&size=${size}`
    );
    if (!response.ok) {
      throw new Error("Hubo un error en la respuesta");
    }
    const data: PagedResponse<Bus> = await response.json();
    return data;
  } catch (error) {
    console.error("Error al obtener los buses:", error);
    throw error;
  }
}


/*FUNCION PARA LLAMAR A UN BUS POR ID */
export async function fetchBusbyId(id: number): Promise<Bus> {
  try {
    const response = await fetch(`http://localhost:8080/bus/${id}`);
    if (!response.ok) {
      throw new Error("Hubo un error en la respuesta");
    }
    const data: Bus = await response.json();
    return data;
  } catch (error) {
    console.error("Error al obtener el bus:", error);
    throw error;
  }
}
